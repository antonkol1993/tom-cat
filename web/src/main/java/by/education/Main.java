package by.education;


import by.education.constants.UsersRole;
import by.education.db.IPerson;
import by.education.db.connector.ConnectorToPersonDatabase;
import by.education.db.connector.ConnectorToPlayerDatabase;
import by.education.db.connector.IConnectortoDatabase;
import by.education.objects.Person;
import by.education.objects.Player;
import by.education.service.PersonService;
import by.education.service.PlayerService;

import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {


//        PersonService instance = PersonService.getInstance();
//        instance.getPersonList();
//
//        for (Person person : instance.getPersonList())
//        {
//            System.out.println(person.getUserRole().name());
//        }

//        PlayerService instance = PlayerService.getInstance();
//        List<Player> playerList = instance.getPlayerList();
//        for (Player players : playerList) {
//            System.out.print(players.getId() + "\t");
//            System.out.print(players.getName() + "\t");
//            System.out.print(players.getAge() + "\t");
//            System.out.print(players.getCountry() + "\t");
//            System.out.print(players.getPosition() + "\t");
//            System.out.println();
//        }
//        instance.removePlayer(1);

        PersonService personService = PersonService.getInstance();
        List<Person> personList = personService.getPersonList();
        for (Person person : personList) {
            System.out.print(person.getId() + "\t");
            System.out.print(person.getUserName() + "\t");
            System.out.print(person.getPassword() + "\t");
            System.out.print(person.getUserRole().name() + "\t");
            System.out.print(person + "\t");
            System.out.println();
        }
        personService.addPerson("112313","sadsadsa");
        personList = personService.getPersonList();
        for (Person person : personList) {
            System.out.print(person.getId() + "\t");
            System.out.print(person.getUserName() + "\t");
            System.out.print(person.getPassword() + "\t");
            System.out.print(person.getUserRole().name() + "\t");
            System.out.print(person + "\t");
            System.out.println();
        }
//        PersonService personService = PersonService.getInstance();
//        List<Person> personList = personService.getPersonList();
//        for (int i = 0; i < personList.size(); i++) {
//            int id = personList.get(i).getId();
//            String userName = personList.get(i).getUserName();
//            String password = personList.get(i).getPassword();
//            UsersRole userRole = personList.get(i).getUserRole();
//            System.out.println(id + ". " + userName + ", "+ password + ", "+ userRole );
//            System.out.println();
//        }

//        IConnectortoDatabase ConnectorPersonDB = ConnectortoDatabase.getInstance();
//        ConnectorPersonDB.getConnection();
//        System.out.println(ConnectorPersonDB.getConnection().getMetaData());
//        instance.removePlayer(1);

    }
}
