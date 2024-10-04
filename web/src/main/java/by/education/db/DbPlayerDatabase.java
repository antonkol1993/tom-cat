package by.education.db;

import by.education.data.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbPlayerDatabase implements PlayerDatabase {

    private static PlayerDatabase instance;

    private final ConnectionManager connectionManager = new ConnectorPlayerDB();
    private final Connection connectionToDataBase = connectionManager.getConnection();

    private static final String GET_PLAYERS = "SELECT * FROM players.players;";
    private static final String INSERT_PLAYER = "INSERT INTO players.players" +
            "(name, age, country, position) VALUES(?,?,?,?)";
    private static final String DELETE_PLAYERS = "DELETE FROM players.players WHERE id = ?";
    private static final String EDIT_PLAYER = "UPDATE players.players " +
            "SET name = ?, age = ?, country = ?, position = ? " +
            "WHERE id = ?";


    private DbPlayerDatabase() {
    }

    public static PlayerDatabase getInstance() {
        if (instance == null) {
            instance = new DbPlayerDatabase();
        }
        return instance;
    }

    @Override
    public List<Player> getPlayerList() {
        try (Statement statement = connectionToDataBase.createStatement()) {

            try (ResultSet resultSet = statement.executeQuery(GET_PLAYERS)) {

                List<Player> players = new ArrayList<>();

                while (resultSet.next()) {
                    Integer id = Integer.valueOf(resultSet.getString("id"));
                    String name = resultSet.getString("name");
                    Integer age = Integer.valueOf(resultSet.getString("age"));
                    String country = resultSet.getString("country");
                    String position = resultSet.getString("position");
                    players.add(new Player(name, age, country, id, position));
                }
                return players;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Player getPlayerById(Integer id) {
        return null;
    }

    @Override
    public void addPlayer(Player player) {
        try (PreparedStatement preparedStatement = connectionToDataBase
                .prepareStatement(INSERT_PLAYER)) {
            String name = player.getName();
            Integer age = player.getAge();
            String country = player.getCountry();
            String position = player.getPosition();
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, country);
            preparedStatement.setString(4, position);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void removePlayer(int id) {

        try (PreparedStatement preparedStatement = connectionToDataBase
                .prepareStatement(DELETE_PLAYERS)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void editPlayer(int id, Player player) {
        try (PreparedStatement preparedStatement = connectionToDataBase.prepareStatement(EDIT_PLAYER)) {
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
