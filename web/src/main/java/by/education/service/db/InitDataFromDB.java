package by.education.service.db;

import by.education.data.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class InitDataFromDB {


    public List<Player> initPlayers() throws Exception {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (
                ClassNotFoundException e) {
            throw new RuntimeException("driver not found");
        }

        try (
                Connection connection = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/players", "root", "root")) {
            System.out.println("passed connection");
            try (Statement statement = connection.createStatement()) {

                try (ResultSet resultSet = statement.executeQuery("SELECT * FROM players;")) {

                    List<Player> players = new ArrayList<Player>();

                    while (resultSet.next()) {
                        Integer id = Integer.valueOf(resultSet.getString("id"));
                        String name = resultSet.getString("name");
                        Integer age = Integer.valueOf(resultSet.getString("age"));
                        String country = resultSet.getString("country");
                        String position = resultSet.getString("position");
                        players.add(new Player(name,age,country,id,position));
                    }
                    return players;

                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } catch (
                SQLException e) {
            throw new RuntimeException(e);
        }
    }

}