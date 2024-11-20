package org.example;

import jakarta.persistence.EntityManager;
import org.example.connector.HibernateUtils;
import org.example.football.Football;
import org.example.football.PreparedFootballDatabase;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<? extends Football> footballObjects = PreparedFootballDatabase.getFootballObjects();

        EntityManager testEntityManager = HibernateUtils.getTestEntityManager();
        testEntityManager.getTransaction().begin();
//        for (int i = 0; i < footballObjects.size(); i++) {
//            testEntityManager.persist(footballObjects.get(i));
//        }
        PreparedFootballDatabase.getCountries().forEach(testEntityManager::persist);
        PreparedFootballDatabase.getLeagues().forEach(testEntityManager::persist);
        testEntityManager.getTransaction().commit();
    }
}
