package by.education.service.db;

import by.education.data.Player;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RemoveFromDB {

    public void removeFromDB(Integer id) {
     try {
        Class.forName("com.mysql.cj.jdbc.Driver");
    } catch (
    ClassNotFoundException e) {
        throw new RuntimeException("driver not found");
    }

        try (
    Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/players", "root", "root")) {
        System.out.println("remove passed connection");
        try (Statement statement = connection.createStatement()) {
            statement.executeUpdate("DELETE FROM players.players WHERE id =" + id + ";");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } catch (
    SQLException e) {
        throw new RuntimeException(e);
    }
}
}

