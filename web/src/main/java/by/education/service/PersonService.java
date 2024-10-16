package by.education.service;


import by.education.constants.UsersRole;
import by.education.db.database.PersonDatabase;
import by.education.db.IPerson;
import by.education.objects.Person;

import java.util.List;

public class PersonService {
    private static PersonService instance;
    private final IPerson personDatabase = PersonDatabase.getInstance();
    private List<Person> personList;
    private PersonService() {
    }

    public static PersonService getInstance() {
        if (instance == null) {
            instance = new PersonService();
        }
        return instance;
    }

    private void updatePerson(){
        personList = personDatabase.getPersonList();
    }

    public List<Person> getPersonList() {
        if ( personList == null) {
            personList = personDatabase.getPersonList();
            return personList;
        }
        return personList;
    }
    public Person getPersonById (int id) {
        personList = getPersonList();
        Person personById;
        for (int i = 0; i < getPersonList().size(); i++) {
            if (personList.get(i).getId() == id) {
                personById = personList.get(i);
                return personById;
            }
        }
        return null;
    }


    public void addPerson(String userName, String password) {
        if (isUniqueUser(userName)) {
        personDatabase.addPerson(new Person(userName,password,UsersRole.USER));
        updatePerson();
        }
    }

//todo it's transfering to another class (ForLoginService)
    public boolean isValid(String userName, String password) {
        for (int i = 0; i < personDatabase.getPersonList().size(); i++) {
            Person person = personDatabase.getPersonList().get(i);
            if (person.getUserName().equalsIgnoreCase(userName) && person.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public Person getPersonByUserName(String userName) {
        for (int i = 0; i < personDatabase.getPersonList().size(); i++) {
            Person person = personDatabase.getPersonList().get(i);
            if (person.getUserName().equals(userName)) {
                return person;
            }
        }
        return null;
    }

    public boolean isUniqueUser(String userName) {
        for (int i = 0; i <getPersonList().size(); i++) {
            if (getPersonList().get(i).getUserName().equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }


}


