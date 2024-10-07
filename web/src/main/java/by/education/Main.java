package by.education;

import by.education.data.Player;
import by.education.db.ConnectorPersonDB;
import by.education.service.PersonService;

import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {


//        PlayerService instance = PlayerService.getInstance();
//        List<Player> playerList = instance.getPlayerList();
//        for (Player player : playerList) {
//            System.out.print(player.getId() + "\t");
//            System.out.print(player.getName() + "\t");
//            System.out.print(player.getAge() + "\t");
//            System.out.print(player.getCountry() + "\t");
//            System.out.print(player.getPosition() + "\t");
//            System.out.println();
//        }
//        instance.removePlayer(1);

//        PersonService instance = PersonService.getInstance();
//        List<Player> playerList = instance.getPlayerList();
//        for (Player player : playerList) {
//            System.out.print(player.getId() + "\t");
//            System.out.print(player.getName() + "\t");
//            System.out.print(player.getAge() + "\t");
//            System.out.print(player.getCountry() + "\t");
//            System.out.print(player.getPosition() + "\t");
//            System.out.println();
//        }

        ConnectorPersonDB connectorPersonDB = new ConnectorPersonDB();
        connectorPersonDB.getConnection();
//        instance.removePlayer(1);

    }
}
