package by.education;


import by.education.constants.UsersRole;
import by.education.db.HibernateUtilDemo;
import by.education.db.IPerson;
import by.education.db.connector.HibernateUtils;
import by.education.db.database.PersonDatabase;
import by.education.db.database.PersonDatabaseHibernate;
import by.education.local.objects.CreatedObjects;
import by.education.objects.Person;
import by.education.service.PersonService;
import jakarta.persistence.EntityManager;

import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {
        PersonDatabaseHibernate personDatabaseHibernate = new PersonDatabaseHibernate();
        personDatabaseHibernate.createPersonsToDatabase(CreatedObjects.getLocalePersons());

    }
}
