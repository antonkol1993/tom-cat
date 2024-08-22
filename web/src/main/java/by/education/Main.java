package by.education;

import by.education.data.Player;
import by.education.db.InMemoryPlayerDatabase;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        InMemoryPlayerDatabase inMemoryPlayerDatabase = new InMemoryPlayerDatabase();
//        inMemoryPlayerDatabase.addPlayer(new Player("saddsa",56,"BELSDAA",21321));
        List<Player> listPlayers= inMemoryPlayerDatabase.getPlayerList();
        listPlayers.add(new Player("saddsa",56,"BELSDAA",21321));
//        inMemoryPlayerDatabase.getPlayerList().add(new Player("saddsa",56,"BELSDAA",21321));
//        for (int i = 0; i < inMemoryPlayerDatabase.getPlayerList().size(); i++) {
//
//            System.out.print(inMemoryPlayerDatabase.getPlayerList().get(i).getName());
//            System.out.print(",");
//            System.out.print(inMemoryPlayerDatabase.getPlayerList().get(i).getAge());
//            System.out.print(",");
//            System.out.print(inMemoryPlayerDatabase.getPlayerList().get(i).getCountry());
//            System.out.print(",");
//            System.out.print(inMemoryPlayerDatabase.getPlayerList().get(i).getId());
//            System.out.println();
//        }
        for (int i = 0; i < listPlayers.size(); i++) {

            System.out.print(listPlayers.get(i).getName());
            System.out.print(",");
            System.out.print(listPlayers.get(i).getAge());
            System.out.print(",");
            System.out.print(listPlayers.get(i).getCountry());
            System.out.print(",");
            System.out.print(listPlayers.get(i).getId());
            System.out.println();
        }
    }

}
