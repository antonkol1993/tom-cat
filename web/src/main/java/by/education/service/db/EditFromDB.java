package by.education.service.db;

import by.education.data.Player;

import java.sql.*;


public class EditFromDB {

    public void editFromDB(Player player) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (
                ClassNotFoundException e) {
            throw new RuntimeException("driver not found");
        }

        try (
                Connection connection = DriverManager
                        .getConnection("jdbc:mysql://localhost:3306/players", "root", "root")) {
            System.out.println("editDB passed connection");

            try (PreparedStatement preparedStatement = connection.prepareStatement("" +
                    "UPDATE players.players " +
                    "SET name = ?, age = ?, country = ?, position = ? " +
                    "WHERE id = ?")) {
                String name = player.getName();
                String age = String.valueOf(player.getAge());
                String country = player.getCountry();
                String position = player.getPosition();
                String id = String.valueOf(player.getId());
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, age);
                preparedStatement.setString(3, country);
                preparedStatement.setString(4, position);
                preparedStatement.setString(5, id);
                preparedStatement.executeUpdate();
                connection.close();
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}


