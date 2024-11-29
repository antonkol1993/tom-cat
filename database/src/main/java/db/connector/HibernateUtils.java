package db.connector;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtils {


    private static final EntityManagerFactory carsFactory =
            Persistence.createEntityManagerFactory("cars");

    private static final EntityManagerFactory testFactory =
            Persistence.createEntityManagerFactory("test");

    private static final EntityManagerFactory hibernateFactory =
            Persistence.createEntityManagerFactory("hibernate");

    private static final EntityManagerFactory playerPersonEntity =
            Persistence.createEntityManagerFactory("player-person");

    public static EntityManager getHibernateEntityManager() {
        return hibernateFactory.createEntityManager();
    }

    public static EntityManager getCarsEntityManager() {
        return carsFactory.createEntityManager();
    }

    public static EntityManager getTestEntityManager() {
        return testFactory.createEntityManager();
    }

    public static EntityManager getPlayerPersonEntityManager() {
        return playerPersonEntity.createEntityManager();
    }

    public static void closeHibernateEntityManager() {
        hibernateFactory.close();
    }

    public static void closeCarsEntityManager() {
        carsFactory.close();
    }

    public static void closeTestEntityManager() {
        testFactory.close();
    }

    public static void closePlayerPersonEntityManager() {
        playerPersonEntity.close();
    }
}
