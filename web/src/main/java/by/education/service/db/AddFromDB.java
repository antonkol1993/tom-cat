package by.education.service.db;

import by.education.data.Player;

import java.sql.*;


public class AddFromDB {

    private static final String INSERT_PLAYER = "INSERT INTO players.players(name, age, country, position) VALUES(?,?,?,?)";

    public void addFromDB(Player player) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (
                ClassNotFoundException e) {
            throw new RuntimeException("driver not found");
        }

        try (
                Connection connection = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/players", "root", "root")) {
            System.out.println("add passed connection");

            try (PreparedStatement preparedStatement = connection
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
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


