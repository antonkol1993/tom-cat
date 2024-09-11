package by.education.service;


import by.education.constants.UsersRole;
import by.education.data.Person;
import by.education.db.InMemoryPersonDatabase;

import java.util.List;

public class PersonService {
    private static PersonService instance;
    InMemoryPersonDatabase persons = new InMemoryPersonDatabase();

    private PersonService() {
    }

    public static PersonService getInstance() {
        if (instance == null) {
            instance = new PersonService();
        }
        return instance;
    }


    public List<Person> getPersonList() {
        return persons.getPersonList();
    }

    public boolean isValid(String userName, String password) {
        for (int i = 0; i < persons.getPersonList().size(); i++) {
            Person person = persons.getPersonList().get(i);
            if (person.getUserName().equals(userName) && person.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public Person getPersonByUserName(String userName) {
        for (int i = 0; i < persons.getPersonList().size(); i++) {
            Person person = persons.getPersonList().get(i);
            if (person.getUserName().equals(userName)) {
                return person;
            }
        }
        return null;
    }
    public void addPerson(String userName, String password) {
        if (isUniqueUser(userName)) {
        getPersonList().add(new Person(userName,password,UsersRole.USER));
        }
    }
    public boolean isUniqueUser(String userName) {
        for (int i = 0; i <getPersonList().size(); i++) {
            if (getPersonList().get(i).getUserName().toLowerCase().equals(userName)) {
                return false;
            }
        }
        return true;
    }


}


