package by.education.service;


import by.education.db.database.PlayerDatabase;
import by.education.db.IPlayer;
import by.education.objects.Person;
import by.education.objects.Player;

import java.util.List;
import java.util.Objects;

public class PlayerService {
    private static PlayerService instance;

    private Integer maxId;
    IPlayer playerListDatabase = PlayerDatabase.getInstance();
    private List<Player> playerList;

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

    public Player getPlayerById(Integer id) {
        return null;
    }


    public void removePlayer(Integer id) throws Exception {
        playerListDatabase.removePlayer(id);
    }

    public boolean isUnique(String name, Integer age, String country, String role) {
        for (int i = 0; i < getPlayerList().size(); i++) {
            if (name.equalsIgnoreCase(getPlayerList().get(i).getName())
                    && age.equals(getPlayerList().get(i).getAge())
                    && country.equalsIgnoreCase(getPlayerList().get(i).getCountry())
                     && role.equalsIgnoreCase(getPlayerList().get(i).getPosition())) {
                return false;
            }
        }
        return true;
    }

    public void addPlayer(String name, Integer age, String country, String role) {

        if (isUnique(name, age, country, role)) {
            playerListDatabase.addPlayer(new Player(name, age, country, role));
        }
    }

    public void editPlayer(Integer id, String name, Integer age, String country, String position) throws Exception {
        Player editedPlayer = null;
        for (Player player : getPlayerList()) {
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
