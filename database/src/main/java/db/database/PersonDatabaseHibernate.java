package db.database;

import db.IPerson;
import db.connector.HibernateUtils;
import by.education.objects.Person;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;

import java.util.List;

public class PersonDatabaseHibernate implements IPerson {
    private static PersonDatabaseHibernate instance;

    private PersonDatabaseHibernate() {
    }

    public static PersonDatabaseHibernate getInstance() {
        if (instance == null) {
            instance = new PersonDatabaseHibernate();
        }
        return instance;
    }

    public void createPersonsToDatabase(List<Person> persons) {
        try (EntityManager entityManager = HibernateUtils.getEntityManager()){
            entityManager.getTransaction().begin();
            for (Person person : persons) {
                entityManager.persist(person);
            }
            entityManager.getTransaction().commit();
        }
    }

    @Override
    public List<Person> getPersonList() {
        EntityManager entityManager = HibernateUtils.getEntityManager();
        var fromPerson = entityManager.createQuery("from Person").getResultList();

        return fromPerson;
    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public void removePerson(int id) {

    }

    @Override
    public void editPerson(int id, String userName, String password) {

    }


}
