package by.education.db;

import by.education.data.Person;

import java.util.List;



public class DbPersonDatabase implements PersonDatabase {
    @Override
    public List<Person> getPersonList() {

        return List.of();
    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public void removePerson(int id) {

    }
}
