package org.example.connector;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtils {


    private static final EntityManagerFactory testFactory =
            Persistence.createEntityManagerFactory("test");


    public static EntityManager getTestEntityManager() {
        return testFactory.createEntityManager();
    }


    public static void closeTestEntityManager() {
        testFactory.close();
    }


}
