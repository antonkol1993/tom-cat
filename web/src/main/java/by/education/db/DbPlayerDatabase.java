package by.education.db;

import by.education.data.Player;
import by.education.service.PlayerService;
import by.education.service.db.AddFromDB;
import by.education.service.db.InitDataFromDB;
import by.education.service.db.RemoveFromDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DbPlayerDatabase implements PlayerDatabase {

    private static PlayerDatabase instance;

    private final ConnectionManager connectionManager = new PlayerConnectorDB();
    private final Connection connectionToDataBase = connectionManager.getConnection();

    private DbPlayerDatabase() {
    }

    public static PlayerDatabase getInstance() {
        if (instance == null) {
            instance = new DbPlayerDatabase();
        }
        return instance;
    }



//    List<Player> playerList = getPlayerList();
//    PlayerService playerService = PlayerService.getInstance();

    @Override
    public List<Player> getPlayerList() {
        try {
            return new InitDataFromDB().initPlayers();
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
        new AddFromDB().addFromDB(player);
    }




    @Override
    public void removePlayer(int id) {
        try {
            new RemoveFromDB().removeFromDB(id);
        } catch (Exception e) {
            throw new RuntimeException("Database error", e);
        }
    }


    @Override
    public void editPlayer(int id, Player player) {
        try (PreparedStatement preparedStatement = connectionToDataBase.prepareStatement("UPDATE players.players " +
                "SET name = ?, age = ?, country = ?, position = ? " +
                "WHERE id = ?")) {
            String name = player.getName();
            Integer age = player.getAge();
            String country = player.getCountry();
            String position = player.getPosition();
            Integer currentId = player.getId();
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, country);
            preparedStatement.setString(4, position);
            preparedStatement.setInt(5, currentId);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
