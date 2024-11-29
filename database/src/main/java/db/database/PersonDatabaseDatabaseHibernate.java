package db.database;

import db.IPersonDatabase;
import db.connector.HibernateUtils;
import objects.Person;
import jakarta.persistence.EntityManager;
import org.hibernate.HibernateException;

import java.util.List;

public class PersonDatabaseDatabaseHibernate implements IPersonDatabase {
    private static PersonDatabaseDatabaseHibernate instance;

    private PersonDatabaseDatabaseHibernate() {
    }

    public static PersonDatabaseDatabaseHibernate getInstance() {
        if (instance == null) {
            instance = new PersonDatabaseDatabaseHibernate();
        }
        return instance;
    }

    private Person getPersonById(int id) {
        List<Person> personList = getPersonList();
        for (Person person : personList) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }

    public void createPersonsFromLocal(List<Person> persons) {
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            entityManager.getTransaction().begin();
            for (Person person : persons) {
                entityManager.persist(person);
            }
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Person> getPersonList() {
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            List<Person> personList = (List<Person>) entityManager.createQuery("from Person").getResultList();
            return personList;
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addPerson(Person person) {
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.persist(person);
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removePerson(Integer id) {
        Person person = getPersonById(id);
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            assert person != null;
            entityManager.getTransaction().begin();
            entityManager.createQuery("DELETE FROM Person WHERE id = :id").setParameter("id", person.getId()).executeUpdate();
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editPerson(Integer id, String userName, String password) {
        Person person = getPersonById(id);
        try (EntityManager entityManager = HibernateUtils.getPlayerPersonEntityManager()) {
            assert person != null;
            entityManager.getTransaction().begin();
            person.setUserName(userName);
            person.setPassword(password);
            entityManager.merge(person);
            entityManager.getTransaction().commit();
        }
    }


}
