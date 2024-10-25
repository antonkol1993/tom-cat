package by.education;


import by.education.constants.UsersRole;
import by.education.db.HibernateUtilDemo;
import by.education.db.IPerson;
import by.education.db.database.PersonDatabase;
import by.education.objects.Person;
import by.education.service.PersonService;
import jakarta.persistence.EntityManager;

import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {
        Person person1 = new Person(null, "zzzzz", "aa222aa",null);
        Person person2 = new Person()
                .withUserName("wwww")
                .withPassword("3333333")
                .withUserRole(UsersRole.USER);

        Person person3 = new Person()
                .withUserName("qqqqq")
                .withPassword("3323131132123");


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
