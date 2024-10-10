package by.education.db.database;

import by.education.db.IPerson;

import java.util.List;



public class PersonDatabase implements IPerson {
    @Override
    public List<by.education.data.objects.Person> getPersonList() {

        return List.of();
    }

    @Override
    public void addPerson(by.education.data.objects.Person person) {

    }

    @Override
    public void removePerson(int id) {

    }
}
