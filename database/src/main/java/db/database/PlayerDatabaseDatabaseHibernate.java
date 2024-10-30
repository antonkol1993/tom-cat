package db.database;

import db.IPlayerDatabase;
import objects.Player;

import java.util.List;

public class PlayerDatabaseDatabaseHibernate implements IPlayerDatabase {
    private static PlayerDatabaseDatabaseHibernate instance;

    private PlayerDatabaseDatabaseHibernate() {
    }

    public static PlayerDatabaseDatabaseHibernate getInstance() {
        if (instance == null) {
            instance = new PlayerDatabaseDatabaseHibernate();
        }
        return instance;
    }

    @Override
    public List<Player> getPlayerList() {
        return List.of();
    }

    @Override
    public Player getPlayerById(Integer id) {
        return null;
    }

    @Override
    public void addPlayer(Player player) {

    }

    @Override
    public void removePlayer(int id) throws Exception {

    }

    @Override
    public void editPlayer(int i, Player player) throws Exception {

    }
}
