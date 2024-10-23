package by.education.model;

import by.education.constants.UsersRole;
import by.education.db.HibernateUtilDemo;
import jakarta.persistence.EntityManager;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person(null, "aaaaa", "aaaa", UsersRole.USER);
        Person person2 = new Person()
                .withUserName("bbbbb")
                .withPassword("bbbbb")
                .withUserRole(UsersRole.USER);

        Person person3 = new Person()
                .withUserName("use1r")
                .withPassword("pass");


        EntityManager entityManager = HibernateUtilDemo.getEntityManager();

        entityManager.getTransaction().begin();
        entityManager.persist(person1);
        entityManager.persist(person2);
        entityManager.persist(person3);
        entityManager.getTransaction().commit();

        Person person = entityManager.find(Person.class, person1.getId());
        @SuppressWarnings("unchecked")
        List<Person> list = (List<Person>)
                entityManager.createQuery("Select p from Person p")
                        .getResultList();
        entityManager.close();
    }
}
