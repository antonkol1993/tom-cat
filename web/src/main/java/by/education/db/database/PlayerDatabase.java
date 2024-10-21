package by.education.db.database;

import by.education.db.IPlayer;
import by.education.db.connector.ConnectorToDatabase;
import by.education.db.connector.IConnectorToDatabase;
import by.education.objects.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PlayerDatabase implements IPlayer {

    private static IPlayer instance;


    private final IConnectorToDatabase connectorPlayersDB = ConnectorToDatabase.getInstance();

    private static final String GET_PLAYERS = "SELECT * FROM my_schema.players;";
    private static final String INSERT_PLAYER = "INSERT INTO my_schema.players" +
            "(name, age, country, position) VALUES(?,?,?,?)";
    private static final String DELETE_PLAYERS = "DELETE FROM my_schema.players WHERE id = ?";
    private static final String EDIT_PLAYER = "UPDATE my_schema.players " +
            "SET name = ?, age = ?, country = ?, position = ? " +
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
                        Player player = new Player(name, age, country, position);
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
