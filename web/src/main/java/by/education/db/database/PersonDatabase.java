package by.education.db.database;

import by.education.db.IPerson;
import by.education.objects.Person;

import java.util.List;



public class PersonDatabase implements IPerson {
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
