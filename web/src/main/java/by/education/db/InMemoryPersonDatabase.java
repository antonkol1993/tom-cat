package by.education.db;

import by.education.constants.UsersRole;
import by.education.data.Person;

import java.util.ArrayList;
import java.util.List;

public class InMemoryPersonDatabase  implements PersonDatabase{
    private final List<Person> personsList;
    public InMemoryPersonDatabase() {
         personsList = new ArrayList<>();
        personsList.add(new Person("Anton", "kolesnikov", UsersRole.USER));
        personsList.add(new Person("Messii", "KOLESNIKOV", UsersRole.USER));
        personsList.add(new Person("chamPion", "kOlesnik-0v", UsersRole.USER));
        personsList.add(new Person("admin", "admin", UsersRole.ADMIN));
        personsList.add(new Person("user", "user", UsersRole.USER));
        personsList.add(new Person("narut", "narut", UsersRole.ADMIN));
    }

    @Override
    public  List<Person> getPersonList () {
        return personsList;
    }

    @Override
    public void addPerson(Person person) {
        getPersonList().add(person);
    }

    @Override
    public void removePerson(int id) {

    }


}
