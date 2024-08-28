package by.education.service;


import by.education.db.InMemoryPlayerDatabase;
import by.education.data.Player;
import by.education.db.PlayerDatabase;

import java.util.List;
import java.util.Objects;

public class PlayerService {
    private static PlayerService instance;

    private Integer maxId;
    PlayerDatabase playerListDatabase = new InMemoryPlayerDatabase();

    private PlayerService() {
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

    public void addPlayer(String name, Integer age, String country) {
        getID();
        playerListDatabase.addPlayer(new Player(name, age, country, ++maxId));
    }


    public Integer deletePlayer(Integer id) {

        int i = 0;
        while (i < getPlayerList().size()) {
            if (Objects.equals(id, getPlayerList().get(i).getId())) getPlayerList().remove(i);
            i++;

        }
        return --i;
    }

    private void getID() {
        maxId = getPlayerList().get(0).getId();
        for (int i = 0; i < getPlayerList().size(); i++) {
            if (maxId < getPlayerList().get(i).getId()) {
                maxId = getPlayerList().get(i).getId();
            }
        }

    }


}
