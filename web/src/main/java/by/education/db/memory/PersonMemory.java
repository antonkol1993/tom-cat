package by.education.db.memory;

import by.education.constants.UsersRole;
import by.education.objects.Person;
import by.education.db.IPerson;

import java.util.ArrayList;
import java.util.List;

public class PersonMemory implements IPerson {
    private final List<Person> personsList;
    public PersonMemory() {
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
