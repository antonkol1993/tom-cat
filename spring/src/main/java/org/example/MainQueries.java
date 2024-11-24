package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.example.football.League;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.jpa.JpaTransactionManager;

import java.util.List;

public class MainQueries {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("hibernate-config.xml");
        JpaTransactionManager txManager = classPathXmlApplicationContext.getBean("txManager", JpaTransactionManager.class);
        EntityManager entityManager = txManager.getEntityManagerFactory().createEntityManager();
        Query fromLeague = entityManager.createQuery("select games from League");
        List resultList = fromLeague.getResultList();
        resultList.forEach(System.out::println);
        entityManager.close();
    }
}
