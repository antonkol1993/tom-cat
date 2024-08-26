package by.education.service;


import by.education.db.InMemoryPlayerDatabase;
import by.education.data.Player;
import by.education.db.PlayerDatabase;

import java.util.List;

public class PlayerService {
    private static PlayerService instance;

    private Integer maxId;

    PlayerDatabase playerListDatabase = new InMemoryPlayerDatabase();

    private PlayerService() {
        // todo init maxId + 1
    }

    public static PlayerService getInstance() {
        if (instance == null) {
            instance = new PlayerService();
        }
        return instance;
    }

    public List<Player> getPlayerList() {
        return playerListDatabase.getPlayerList();
    }
    public void addPlayer(Player player) {
        maxId++;
        playerListDatabase.addPlayer(player);
    }
//    public List<Player> deletePlayer (Player player) {
//        playerListDatabase.rem(player);
//        return playerListDatabase.getPlayerList();
//    }

}
