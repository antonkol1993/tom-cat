package by.education;

import by.education.data.Player;
import by.education.db.DbPlayerDatabase;
import by.education.db.PlayersConnector;
import by.education.service.PlayerService;
import by.education.service.db.AddFromDB;
import by.education.service.db.EditFromDB;
import by.education.service.db.RemoveFromDB;

import java.util.List;

public class Main  {
    public static void main(String[] args) throws Exception {


        PlayersConnector playersConnector = new PlayersConnector();
        playersConnector.getConnection();

    }
}
