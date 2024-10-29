package db.connector;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtils {
//    private static HibernateUtils instance;
//    private HibernateUtils() {
//
//    }
//    public static HibernateUtils getInstance() {
//        if (instance == null) {
//            instance = new HibernateUtils();
//            return instance;
//        }
//        return instance;
//    }

    private static final EntityManagerFactory factory =
            Persistence.createEntityManagerFactory("player-person-app-unit");

    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }

    public static void closeEntityManager() {
        factory.close();
    }


}
