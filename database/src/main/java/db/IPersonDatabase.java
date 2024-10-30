package db;

import objects.Person;

import java.util.List;

public interface IPersonDatabase {
    List<Person> getPersonList();
    void addPerson(Person person);
    void removePerson (int id);
    void editPerson (int id, String userName, String password);
}
