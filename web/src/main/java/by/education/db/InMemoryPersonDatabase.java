package by.education.db;

import by.education.data.Person;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPersonDatabase  implements PersonDatabase{
    private final List<Person> personsList;
    public InMemoryPersonDatabase() {
         personsList = new ArrayList<>();
        personsList.add(new Person("Anton", "kolesnikov"));
        personsList.add(new Person("Messii", "KOLESNIKOV"));
        personsList.add(new Person("chamPion", "kOlesnik-0v"));
        personsList.add(new Person("admin", "admin"));
        personsList.add(new Person("user", "user"));
    }

    @Override
    public  List<Person> getPersonList () {
        return personsList;
    }

}
