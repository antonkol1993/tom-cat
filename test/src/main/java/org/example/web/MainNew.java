package org.example.web;

import db.connector.HibernateUtils;
import jakarta.persistence.EntityManager;
import objects.Person;
import org.example.PersonService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class MainNew {
    public static void main(String[] args) throws Exception {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.example.web");
        Class<PersonService> personServiceClass = PersonService.class;
        context.register(personServiceClass);
        context.refresh();
        PersonService personService = context.getBean(personServiceClass);
        PersonService bean = context.getBean(personServiceClass);
        PersonService bean1 = context.getBean(personServiceClass);
        List<Person> personList = personService.getPersonList();

        for (Person person : personList) {
            System.out.println(person);
        }



    }
}
