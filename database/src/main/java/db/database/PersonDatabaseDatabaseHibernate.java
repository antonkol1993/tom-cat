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

    public void createPersonsToDatabase(List<Person> persons) {
        try (EntityManager entityManager = HibernateUtils.getEntityManager()){
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
        try (EntityManager entityManager = HibernateUtils.getEntityManager()) {
            return entityManager.createQuery("from Person").getResultList();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addPerson(Person person) {
        try (EntityManager entityManager = HibernateUtils.getEntityManager()) {
            entityManager.getTransaction().begin();
            entityManager.persist(person);
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removePerson(int id) {
        List<Person> personList = getPersonList();
        Person person = null;
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getId() == id) {
            person = personList.get(i);
            }
        }
        try (EntityManager entityManager = HibernateUtils.getEntityManager()) {
            assert person != null;
            entityManager.getTransaction().begin();
            entityManager.createQuery("DELETE FROM Person WHERE id = :id").setParameter("id", person.getId()).executeUpdate();
            entityManager.getTransaction().commit();
        } catch (HibernateException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editPerson(int id, String userName, String password) {

    }


}