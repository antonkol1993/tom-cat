package by.education.service;


import by.education.data.Player;
import by.education.db.DbPlayerDatabase;
import by.education.db.InMemoryPlayerDatabase;
import by.education.db.PlayerDatabase;

import java.util.List;
import java.util.Objects;

public class PlayerService {
    private static PlayerService instance;

    private Integer maxId;
    PlayerDatabase playerListDatabase = new DbPlayerDatabase();

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

    public void addPlayer(String name, Integer age, String country, String role) {
        getID();
        playerListDatabase.addPlayer(new Player(name, age, country, ++maxId, role));
    }


    public void deletePlayer(Integer id) {

        int i = 0;
        while (i < getPlayerList().size()) {
            if (Objects.equals(id, getPlayerList().get(i).getId())) getPlayerList().remove(i);
            i++;
        }
    }

    public void editPlayer(Integer id, String name, Integer age, String country, String position) {

        for (Player player : getPlayerList()) {
            if (Objects.equals(player.getId(), id)) {
                player.setName(name);
                player.setAge(age);
                player.setCountry(country);
                player.setPosition(position);
            }
        }
    }

    private void getID() {
        // todo will doing add after deleteAll without exceptions
        if (getPlayerList().isEmpty()) {
            maxId = 0;
        } else {
            maxId = getPlayerList().get(0).getId();
            for (int i = 0; i < getPlayerList().size(); i++) {
                if (maxId < getPlayerList().get(i).getId()) {
                    maxId = getPlayerList().get(i).getId();
                }
            }
        }


    }


}
