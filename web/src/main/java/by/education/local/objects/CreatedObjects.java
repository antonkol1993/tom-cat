package by.education.local.objects;

import by.education.constants.UsersRole;
import by.education.objects.Person;

import java.util.List;

public class CreatedObjects {
    public static List<Person> getLocalePersons() {
        return List.of(
                new Person().withUserName("Anton").withPassword("adswqeeqw").withUserRole(UsersRole.USER),
                new Person().withUserName("Andrey").withPassword("Andrey").withUserRole(UsersRole.ADMIN),
                new Person().withUserName("Narut").withPassword("naRUT").withUserRole(UsersRole.ADMIN),
                new Person().withUserName("Kolesnikov").withPassword("koleson").withUserRole(UsersRole.USER),
                new Person().withUserName("Messi").withPassword("dasaweq").withUserRole(UsersRole.USER),
                new Person().withUserName("uBIVATOR-3000").withPassword("destoyer").withUserRole(UsersRole.USER)
        );
    }

}
