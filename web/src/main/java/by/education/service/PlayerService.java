package by.education.service;


import by.education.db.InMemoryPlayerDatabase;
import by.education.data.Player;
import by.education.db.PlayerDatabase;

import java.util.List;

public class PlayerService {
    private static PlayerService instance;

    PlayerDatabase playerListDatabase = new InMemoryPlayerDatabase();

    private PlayerService() {
    }

    public static PlayerService getInstance() {
        if (instance == null) {
            instance = new PlayerService();
        }
        return instance;
    }

    public List<Player> getList() {
        return playerListDatabase.getPlayerList();
    }

}
