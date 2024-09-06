package by.education;

import by.education.data.Player;
import by.education.db.InMemoryPersonDatabase;
import by.education.db.InMemoryPlayerDatabase;
import by.education.service.PersonService;
import by.education.service.PlayerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        PersonService personService = PersonService.getInstance();

        InMemoryPersonDatabase inMemoryPersonDatabase = new InMemoryPersonDatabase();

        for (int i = 0; i < inMemoryPersonDatabase.getPersonList().size(); i++) {
            System.out.print("username: " + inMemoryPersonDatabase.getPersonList().get(i).getUserName() + ", ");
            System.out.println("password: " +inMemoryPersonDatabase.getPersonList().get(i).getPassword());
            System.out.println();
        }
        System.out.println(personService.isValid("messi", "sadsadsad"));
        System.out.println(personService.isValid("messii", "KOLESNIKOV"));
        System.out.println(personService.isValid("messii", "KOLESNIKOv"));
        System.out.println(personService.isValid("champion", "kOlesnik-0v"));


    }
}
