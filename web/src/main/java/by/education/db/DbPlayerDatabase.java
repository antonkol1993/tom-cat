package by.education.db;

import by.education.data.Player;
import by.education.service.InitDataFromDB;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;
import java.util.List;

public class DbPlayerDatabase implements PlayerDatabase {



    private List<Player> initPlayersFromDB() throws Exception {
        return new InitDataFromDB().initPlayers();
    };

    @Override
    public List<Player> getPlayerList() {
        try {
            return initPlayersFromDB();
        } catch (Exception e) {
            throw new RuntimeException("Database error", e);
        }
    }

    @Override
    public Player getPlayerById(Integer id) {
        return null;
    }

    @Override
    public void addPlayer(Player player) {

    }

    @Override
    public void removePlayer(int id) {

    }

    @Override
    public void editPlayer(int i, Player player) {

    }
}
