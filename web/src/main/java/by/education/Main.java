package by.education;


import by.education.constants.UsersRole;
import by.education.db.HibernateUtilDemo;
import by.education.db.IPerson;
import by.education.db.connector.HibernateUtils;
import by.education.db.database.EmployeeManager;
import by.education.db.database.PersonDatabase;
import by.education.db.database.PersonDatabaseHibernate;
import by.education.local.objects.CreatedObjects;
import by.education.objects.Person;
import by.education.service.PersonService;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

//        PersonDatabaseHibernate instance = PersonDatabaseHibernate.getInstance();
//        List<Person> personList = instance.getPersonList();
//        for (Person person : personList) {
//            System.out.print(person.getId());
//            System.out.print("  ");
//            System.out.print(person.getUserName());
//            System.out.print("  ");
//            System.out.print(person.getPassword());
//            System.out.print("  ");
//            System.out.print(person.getUserRole());
//            System.out.print("!!!!!!!!!!!!");
//        }

        PersonDatabaseHibernate instance = PersonDatabaseHibernate.getInstance();
        instance.createPersonsToDatabase(CreatedObjects.getLocalePersons());
        List<Person> personList = instance.getPersonList();
        personList.forEach(System.out::println);
//        EmployeeManager employeeManager = new EmployeeManager();
//        Session session = employeeManager.getSession();
//        System.out.println(session);
    }
}
