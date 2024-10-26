package by.education.db.database;

import by.education.db.IPerson;
import by.education.db.connector.HibernateUtils;
import by.education.objects.Person;
import jakarta.persistence.EntityManager;

import java.util.List;

public class PersonDatabaseHibernate implements IPerson {

private EntityManager entityManager = HibernateUtils.getEntityManager();

public void createPersonsToDatabase (List<Person> persons) {
        entityManager.getTransaction().begin();
        for (Person person : persons) {
        entityManager.persist(person);
        }
    entityManager.getTransaction().commit();
    entityManager.close();
    }

    @Override
    public List<Person> getPersonList() {
        return List.of();
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
