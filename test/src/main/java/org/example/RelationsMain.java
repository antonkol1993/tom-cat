package org.example;

import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;

public class RelationsMain {

    public static void main(String[] args) {
        EntityManager entityManager = HibernateUtils.getEntityManager();

    }
}
