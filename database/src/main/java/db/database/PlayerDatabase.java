package db.database;

import db.IPlayer;
import db.connector.ConnectorToDatabase;
import db.connector.IConnectorToDatabase;
import by.education.objects.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PlayerDatabase implements IPlayer {

    private static IPlayer instance;


    private final IConnectorToDatabase connectorPlayersDB = ConnectorToDatabase.getInstance();

    private static final String GET_PLAYERS = "SELECT * FROM my_schema.players;";
    private static final String INSERT_PLAYER = "INSERT INTO my_schema.players" +
            "(name, age, country, position, rating) VALUES(?,?,?,?,?)";
    private static final String DELETE_PLAYERS = "DELETE FROM my_schema.players WHERE id = ?";
    private static final String EDIT_PLAYER = "UPDATE my_schema.players " +
            "SET name = ?, age = ?, country = ?, position = ?, rating = ? " +
            "WHERE id = ?";


    private PlayerDatabase() {
    }

    public static IPlayer getInstance() {
        if (instance == null) {
            instance = new PlayerDatabase();
        }
        return instance;
    }

    private List<Player> players;

    @Override
    public List<Player> getPlayerList() {


        try (Connection connection = connectorPlayersDB.getConnection();
             Statement statement = connection.createStatement()) {

            try (ResultSet resultSet = statement.executeQuery(GET_PLAYERS)) {

                players = new ArrayList<>();
                while (resultSet.next()) {
                    Integer id = Integer.valueOf(resultSet.getString("id"));
                    String name = resultSet.getString("name");
                    Integer age = Integer.valueOf(resultSet.getString("age"));
                    String country = resultSet.getString("country");
                    String position = resultSet.getString("position");
                    String rating;
                    if (resultSet.getString("rating").isEmpty() ||
                            Objects.equals(resultSet.getString("rating"), "<null>") ||
                            Objects.equals(resultSet.getString("rating" ), "null")) {
                        rating = "DNP";
                    } else {
                        rating = resultSet.getString("rating");
                    }

                    Player player = new Player(name, age, country, position, rating);
                    player.setId(id);
                    players.add(player);
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

        try (Connection connection = connectorPlayersDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PLAYER)) {
            String name = player.getName();
            Integer age = player.getAge();
            String country = player.getCountry();
            String position = player.getPosition();
            String rating = player.getRating();
            if (rating.isEmpty()) {
                rating = "DNP";
            }
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, country);
            preparedStatement.setString(4, position);
            preparedStatement.setString(5, rating);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void removePlayer(int id) {

        try (Connection connection = connectorPlayersDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PLAYERS)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public void editPlayer(int id, Player player) {
        try (Connection connection = connectorPlayersDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(EDIT_PLAYER)) {
            String name = player.getName();
            Integer age = player.getAge();
            String country = player.getCountry();
            String position = player.getPosition();
            Integer currentId = player.getId();
            String rating = player.getRating();
            if (rating.isEmpty()) {
                rating = "DNP";
            }
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.setString(3, country);
            preparedStatement.setString(4, position);
            preparedStatement.setString(5, rating);
            preparedStatement.setInt(6, currentId);
            preparedStatement.executeUpdate();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
