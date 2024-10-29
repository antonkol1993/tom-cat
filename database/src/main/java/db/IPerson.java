package db;

import by.education.objects.Person;

import java.util.List;

public interface IPerson {
    List<Person> getPersonList();
    void addPerson(Person person);
    void removePerson (int id);
    void editPerson (int id, String userName, String password);
}
