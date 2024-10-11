package by.education;


import by.education.constants.UsersRole;
import by.education.db.IPerson;
import by.education.db.connector.ConnectorToPersonDatabase;
import by.education.db.connector.ConnectorToPlayerDatabase;
import by.education.db.connector.IConnectortoDatabase;
import by.education.objects.Person;
import by.education.service.PersonService;
import by.education.service.PlayerService;

import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {


//        PlayerService instance = PlayerService.getInstance();
//        List<PlayerDatabase> playerList = instance.getPlayerList();
//        for (PlayerDatabase players : playerList) {
//            System.out.print(players.getId() + "\t");
//            System.out.print(players.getName() + "\t");
//            System.out.print(players.getAge() + "\t");
//            System.out.print(players.getCountry() + "\t");
//            System.out.print(players.getPosition() + "\t");
//            System.out.println();
//        }
//        instance.removePlayer(1);

//        PersonService instance = PersonService.getInstance();
//        List<PlayerDatabase> playerList = instance.getPlayerList();
//        for (PlayerDatabase players : playerList) {
//            System.out.print(players.getId() + "\t");
//            System.out.print(players.getName() + "\t");
//            System.out.print(players.getAge() + "\t");
//            System.out.print(players.getCountry() + "\t");
//            System.out.print(players.getPosition() + "\t");
//            System.out.println();
//        }
        PersonService personService = PersonService.getInstance();
        List<Person> personList = personService.getPersonList();
        for (int i = 0; i < personList.size(); i++) {
            int id = personList.get(i).getId();
            String userName = personList.get(i).getUserName();
            String password = personList.get(i).getPassword();
            UsersRole userRole = personList.get(i).getUserRole();
            System.out.println(id + ". " + userName + ", "+ password + ", "+ userRole );
            System.out.println();
        }

//        IConnectortoDatabase ConnectorPersonDB = ConnectortoDatabase.getInstance();
//        ConnectorPersonDB.getConnection();
//        System.out.println(ConnectorPersonDB.getConnection().getMetaData());
//        instance.removePlayer(1);

    }
}
