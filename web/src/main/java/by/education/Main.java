package by.education;

import by.education.data.Player;
import by.education.db.DbPlayerDatabase;
import by.education.db.InMemoryPersonDatabase;
import by.education.db.InMemoryPlayerDatabase;
import by.education.service.InitDataFromDB;
import by.education.service.PersonService;
import by.education.service.PlayerService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {

        DbPlayerDatabase dbPlayerDatabase = new DbPlayerDatabase();
        List<Player> players = dbPlayerDatabase.getPlayerList();
        for (Player player : players) {
            Integer id = player.getId();
            String name = player.getName();
            Integer age = player.getAge();
            String country = player.getCountry();
            String position = player.getPosition();
            System.out.print(name + "\t" + age + "\t" + country + "\t" + position + "\n");

        }
    }
}
