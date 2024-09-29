package by.education.service.db;

import by.education.data.Player;

import java.sql.*;


public class AddFromDB {

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
            System.out.println("passed connection");

            try (PreparedStatement preparedStatement = connection
                    .prepareStatement("INSERT INTO players.players(name, age, country, position) VALUES(?,?,?,?)")) {
                String name = player.getName();
                Integer age = player.getAge();
                String country = player.getCountry();
                String position = player.getPosition();
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, String.valueOf(age));
                preparedStatement.setString(3, country);
                preparedStatement.setString(4, position);
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


