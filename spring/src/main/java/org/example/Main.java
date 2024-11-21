package org.example;

import jakarta.persistence.EntityManager;
import org.example.football.Football;
import org.example.football.PreparedFootballDatabase;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends Football> footballObjects = PreparedFootballDatabase.getCountries();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate-config.xml");
        JpaTransactionManager transactionManager = context.getBean("txManager", JpaTransactionManager.class);
        EntityManager testEntityManager = transactionManager.getEntityManagerFactory().createEntityManager();

        testEntityManager.getTransaction().begin();
//        for (int i = 0; i < footballObjects.size(); i++) {
//            testEntityManager.persist(footballObjects.get(i));
//        }
        PreparedFootballDatabase.getCountries().forEach(testEntityManager::persist);
        PreparedFootballDatabase.getLeagues().forEach(testEntityManager::persist);
        testEntityManager.getTransaction().commit();
    }
}
