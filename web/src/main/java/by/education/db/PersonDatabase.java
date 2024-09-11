package by.education.db;

import by.education.data.Person;

import java.util.List;

public interface PersonDatabase {
    List<Person> getPersonList();
    void addPersonList(Person person);

}
