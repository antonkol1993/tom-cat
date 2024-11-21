package org.example;

import jakarta.persistence.EntityManager;
import org.example.football.PreparedFootballDatabase;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;

public class MainForDbSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("hibernate-config.xml");
        JpaTransactionManager transactionManager = context.getBean("txManager", JpaTransactionManager.class);
        EntityManager testEntityManager = transactionManager.getEntityManagerFactory().createEntityManager();

        testEntityManager.getTransaction().begin();
//        for (int i = 0; i < footballObjects.size(); i++) {
//            testEntityManager.persist(footballObjects.get(i));
//        }
        PreparedFootballDatabase.getCountries().forEach(testEntityManager::persist);
        PreparedFootballDatabase.getLeagues().forEach(testEntityManager::persist);
        PreparedFootballDatabase.getGames().forEach(testEntityManager::persist);
        PreparedFootballDatabase.getTeams().forEach(testEntityManager::persist);
        PreparedFootballDatabase.getPlayers().forEach(testEntityManager::persist);

        testEntityManager.getTransaction().commit();
    }
}
