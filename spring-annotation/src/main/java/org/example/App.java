package org.example;

import org.example.config.Config;
import org.example.config.DbConfig;
import org.example.model.Person;
import org.example.service.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
//        ClassPathXmlApplicationContext context =
//                new ClassPathXmlApplicationContext("app-context.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(Config.class);
        context.refresh();
        context.start();

        Person person = context.getBean("person", Person.class);
        System.out.println(person);

        PersonService personService = context.getBean("personService", PersonService.class);

        System.out.println(personService);

        DbConfig dbConfig = context.getBean("dbConfig", DbConfig.class);
        System.out.println(dbConfig);

    }
}
