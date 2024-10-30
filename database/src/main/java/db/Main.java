package db;

import constants.UsersRole;
import db.created.objects.CreatedObjects;
import db.database.PersonDatabaseDatabaseHibernate;
import objects.Person;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        PersonDatabaseDatabaseHibernate personDatabaseDatabaseHibernate = PersonDatabaseDatabaseHibernate.getInstance();
//        personDatabaseDatabaseHibernate.createPersonsToDatabase(CreatedObjects.getLocalePersons());

        personDatabaseDatabaseHibernate.removePerson(2);
        List<Person> personList = personDatabaseDatabaseHibernate.getPersonList();
        personList.forEach(System.out::println);

    }
}
