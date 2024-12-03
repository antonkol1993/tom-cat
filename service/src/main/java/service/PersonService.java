package service;


import constants.UsersRole;
import db.database.PersonDatabaseDatabaseHibernate;
import db.IPersonDatabase;
import lombok.Data;
import lombok.NoArgsConstructor;
import objects.Person;
import org.springframework.stereotype.Service;

import java.util.List;
@Service(value = "personServ")

public class PersonService {

    private static PersonService instance;
    private PersonService (){}
    public static PersonService getInstance() {
        if (instance == null) {
            instance = new PersonService();
        }
        return instance;
    }

    IPersonDatabase personDatabase = PersonDatabaseDatabaseHibernate.getInstance();

    public List<Person> getPersonList() {
        return personDatabase.getPersonList();
    }

    public Person getPersonById(int id) {
        List <Person> personList = personDatabase.getPersonList();
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
            personDatabase.addPerson(new Person()
                    .withUserName(userName)
                    .withPassword(password)
                    .withUserRole(UsersRole.USER));
        }
    }

    //todo it's should to transfer to another class (ForLoginService)
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
        for (int i = 0; i < getPersonList().size(); i++) {
            if (getPersonList().get(i).getUserName().equalsIgnoreCase(userName)) {
                return false;
            }
        }
        return true;
    }
//todo need to do

    public void editPerson(int id, String userName, String password) {
        personDatabase.editPerson(id, userName, password);
    }

    public void removePerson(int id) {
        personDatabase.removePerson(id);
    }


}


