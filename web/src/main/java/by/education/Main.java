package by.education;

import by.education.data.Player;
import by.education.db.DbPlayerDatabase;
import by.education.service.PlayerService;
import by.education.service.db.AddFromDB;
import by.education.service.db.EditFromDB;
import by.education.service.db.RemoveFromDB;

import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {

        PlayerService instance = PlayerService.getInstance();
        instance.editPlayer(22,"17171717",17,"Ame171717", "1717midfielder");
//        Player player = new Player("17171717", 17, "Ame171717", 21, "1717midfielder");

    }
}
