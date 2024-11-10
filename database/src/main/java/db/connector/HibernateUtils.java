package db.connector;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtils {

    private static final EntityManagerFactory hibernateFactory =
            Persistence.createEntityManagerFactory("hibernate");

    private static final EntityManagerFactory carsFactory =
            Persistence.createEntityManagerFactory("cars");

    public static EntityManager getHibernateEntityManager() {
        return hibernateFactory.createEntityManager();
    }

    public static EntityManager getCarsEntityManager() {
        return carsFactory.createEntityManager();
    }

    public static void closeEntityManager() {
        hibernateFactory.close();
    }


}
