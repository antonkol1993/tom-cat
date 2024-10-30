package db;

import db.created.objects.CreatedObjects;
import db.database.PersonDatabaseHibernate;
import jakarta.persistence.EntityManager;
import objects.Person;

public class Main {
    public static void main(String[] args) {

        PersonDatabaseHibernate instance = PersonDatabaseHibernate.getInstance();
        instance.createPersonsToDatabase(CreatedObjects.getLocalePersons());
    }
}
