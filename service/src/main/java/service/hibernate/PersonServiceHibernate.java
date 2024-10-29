package service.hibernate;

import by.education.objects.Person;

import java.util.List;

public class PersonServiceHibernate implements IPersonServiceHibernate{
    @Override
    public List<Person> getPersonList() {
        return List.of();
    }

    @Override
    public Person getPersonById(Integer id) {
        return null;
    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public void editPerson(int id, String userName, String password) {

    }

    @Override
    public void removePerson(int id) {

    }
}
