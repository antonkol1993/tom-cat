package by.education;


import by.education.constants.UsersRole;
import by.education.db.IPerson;
import by.education.db.connector.ConnectorToPersonDatabase;
import by.education.db.connector.ConnectorToPlayerDatabase;
import by.education.db.connector.IConnectortoDatabase;
import by.education.db.database.PersonDatabase;
import by.education.objects.Person;
import by.education.objects.Player;
import by.education.service.PersonService;
import by.education.service.PlayerService;

import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {


//        PersonService personService = PersonService.getInstance();
//        Person personById = personService.getPersonById(13);
//        personService.editPerson(personById.getId(), "9999999","238213");

        IPerson personDatabase = PersonDatabase.getInstance();
        PersonService personService = PersonService.getInstance();
        personService.removePerson(10);
    }
}
