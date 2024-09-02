package by.education;

import by.education.data.Player;
import by.education.db.InMemoryPlayerDatabase;
import by.education.service.PlayerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        InMemoryPlayerDatabase inMemoryPlayerDatabase = new InMemoryPlayerDatabase();
        PlayerService playerService = PlayerService.getInstance();
        List<Player> playerList = playerService.getPlayerList();
//        inMemoryPlayerDatabase.addPlayer(new Player("saddsa",56,"BELSDAA",21321));
//        List<Player> listPlayers = inMemoryPlayerDatabase.getPlayerList();


        playerService.addPlayer("saddsasa", 3232, "saddsasa","adsadsadsasdads");
        playerService.addPlayer("213321321", 23241, "asewqq1","adsadsadsasdads");
//        playerService.addPlayer("DADASDSA", 5555, "##@!#!@!#@");




        for (int i = 0; i < playerList.size(); i++) {

            System.out.print(playerList.get(i).getName());
            System.out.print(",");
            System.out.print(playerList.get(i).getAge());
            System.out.print(",");
            System.out.print(playerList.get(i).getCountry());
            System.out.print(",");
            System.out.print(playerList.get(i).getId());
            System.out.println();

        }
        System.out.println();
        System.out.println();
        System.out.println();
        playerService.editPlayer(3,"MESSIDSSD", 33333,"ARGENTINA");
        for (int i = 0; i < playerList.size(); i++) {

            System.out.print(playerList.get(i).getName());
            System.out.print(",");
            System.out.print(playerList.get(i).getAge());
            System.out.print(",");
            System.out.print(playerList.get(i).getCountry());
            System.out.print(",");
            System.out.print(playerList.get(i).getId());
            System.out.println();

        }

    }
}
