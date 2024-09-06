package by.education.service;


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

    public boolean isValid (String userName, String password) {
        List<Person> personList = persons.getPersonList();
        for (int i = 0; i < persons.getPersonList().size(); i++) {
            if (userName.equalsIgnoreCase(personList.get(i).getUserName())) {
                return password.equals(personList.get(i).getPassword());
            }
        }
        return false;
    }



    }


