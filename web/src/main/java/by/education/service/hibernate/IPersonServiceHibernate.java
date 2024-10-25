package by.education.service.hibernate;

import by.education.objects.Person;

import java.util.List;


public interface IPersonServiceHibernate {
    List<Person> getPersonList();
    Person getPersonById(Integer id);
    void addPerson(Person person);
    void editPerson (int id, String userName, String password);
    void removePerson (int id);
}
