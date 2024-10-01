package by.education;

import by.education.db.PlayerConnectorDB;
import by.education.service.PlayerService;

public class Main  {
    public static void main(String[] args) throws Exception {


        PlayerService instance = PlayerService.getInstance();
        instance.editPlayer(4,"9999999",9999999,"9999999","9999999");

    }
}
