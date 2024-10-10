package by.education.service;


import by.education.db.database.PlayerDatabase;
import by.education.db.IPlayer;

import java.util.List;
import java.util.Objects;

public class PlayerService {
    private static PlayerService instance;

    private Integer maxId;
    IPlayer playerListDatabase = PlayerDatabase.getInstance();

    private PlayerService() {
    }

    public static PlayerService getInstance() {
        if (instance == null) {
            instance = new PlayerService();
        }
        return instance;
    }

    public List<by.education.data.objects.Player> getPlayerList() {
        return playerListDatabase.getPlayerList();
    }

    public by.education.data.objects.Player getPlayerById(Integer id) {
        return null;
    }


    public void removePlayer(Integer id) throws Exception {
//        int i = 0;
//        while (i < getPlayerList().size()) {
//            if (Objects.equals(id, getPlayerList().get(i).getId())) getPlayerList().remove(i);
//            i++;
//        }
        playerListDatabase.removePlayer(id);
    }

    public boolean isUnique(String name) {
        for (int i = 0; i < getPlayerList().size(); i++) {

            if (name.equals(getPlayerList().get(i).getName())) {
                return false;
            }
        }
        return true;
    }

    public void addPlayer(String name, Integer age, String country, String role) {
        getID();
        if (isUnique(name)) {
            playerListDatabase.addPlayer(new by.education.data.objects.Player(name, age, country, ++maxId, role));
        }
    }

    public void editPlayer(Integer id, String name, Integer age, String country, String position) throws Exception {
        by.education.data.objects.Player editedPlayer = null;
        for (by.education.data.objects.Player player : getPlayerList()) {
            if (Objects.equals(player.getId(), id)) {
                player.setName(name);
                player.setAge(age);
                player.setCountry(country);
                player.setPosition(position);
                editedPlayer = player;
            }
        }
        if (editedPlayer != null) {
            playerListDatabase.editPlayer(id, editedPlayer);
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
