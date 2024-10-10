package by.education.db;

import by.education.data.objects.Person;

import java.util.List;

public interface IPerson {
    List<Person> getPersonList();
    void addPerson(Person person);
    void removePerson (int id);
}
