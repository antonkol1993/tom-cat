package by.education;


import by.education.db.IPerson;
import by.education.db.database.PersonDatabase;
import by.education.service.PersonService;

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
