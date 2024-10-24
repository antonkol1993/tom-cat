package by.education.db;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtilDemo {

    private static final EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("player-app-unit");


    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void closeEntityManager() {
        factory.close();
    }
}
