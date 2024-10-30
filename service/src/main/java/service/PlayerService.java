package service;


import db.database.PlayerDatabaseDatabaseHibernate;
import db.database.PlayerDatabaseDatabaseJDBC;
import db.IPlayerDatabase;
import objects.Player;

import java.util.List;
import java.util.Objects;

public class PlayerService {
    private static PlayerService instance;

    IPlayerDatabase playerListDatabase = PlayerDatabaseDatabaseHibernate.getInstance();

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

    public void addPlayer(String name, Integer age, String country, String position, String rating) {

        if (isUnique(name, age, country, position)) {
            playerListDatabase.addPlayer(
                    new Player()
                            .withName(name)
                            .withAge(age)
                            .withCountry(country)
                            .withPosition(position)
                            .withRating(rating));
        }
    }

    public void editPlayer(Integer id, String name,
                           Integer age, String country,
                           String position, String rating) throws Exception {
        Player editedPlayer = null;
        for (Player player : getPlayerList()) {
            if (Objects.equals(player.getId(), id)) {
                player.setName(name);
                player.setAge(age);
                player.setCountry(country);
                player.setPosition(position);
                player.setRating(rating);
                editedPlayer = player;
            }
        }
        if (editedPlayer != null) {
            playerListDatabase.editPlayer(id, editedPlayer);
        }

    }

}
