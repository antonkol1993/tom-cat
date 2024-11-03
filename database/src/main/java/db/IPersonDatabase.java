package db;

import objects.Person;

import java.util.List;

public interface IPersonDatabase {
    List<Person> getPersonList();

    void addPerson(Person person);

    void removePerson(Integer id);

    void editPerson(Integer id, String userName, String password);
}
