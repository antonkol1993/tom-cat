package by.education.service.db;

import java.sql.*;


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
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    } catch (
    SQLException e) {
        throw new RuntimeException(e);
    }
}
}

