package by.education.db;

import by.education.data.Person;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPersonDatabase  {
    private final List<Person> personsList;
    public InMemoryPersonDatabase() {
         personsList = new ArrayList<>();
        personsList.add(new Person("Anton", "kolesnikov"));
        personsList.add(new Person("Messii", "KOLESNIKOV"));
        personsList.add(new Person("chamPion", "kOlesnik-0v"));
    }

    public  List<Person> getPersonList () {
        return personsList;
    }

}
