package by.education;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main( String[] args )  {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("driver not found");
        }

        try (Connection connection = DriverManager
                .getConnection("jdbc:mysql://localhost:3306/players", "root", "root");){
//            DatabaseMetaData metaData = connection.getMetaData();
//            ResultSet schemas = metaData.getSchemas();
//            System.out.println(schemas);

            Connection connection2 = DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/players", "root", "root");
            DatabaseMetaData metaData = connection2.getMetaData();
            String userName = metaData.getUserName();
            String url = metaData.getURL();
            System.out.println(userName);
            System.out.println(url);
            try (Statement statement = connection.createStatement()) {

                try ( ResultSet resultSet = statement.executeQuery("SELECT * FROM players;")){
                    while (resultSet.next()) {

                        System.out.print(resultSet.getString(2));
                        System.out.println("\t" + resultSet.getString(3));
//                        System.out.println(resultSet.getString(3));
                        System.out.println();

//                        System.out.println(resultSet.getString("id"));
//                        System.out.println(resultSet.getString("first_name"));
//                        System.out.println(resultSet.getString("last_name"));
//                        System.out.println("-------");
                    }
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            //-------------------------

//            try(PreparedStatement statement = connection
//                    .prepareStatement("INSERT INTO user(first_name, last_name) VALUES(?,?)")) {
//                statement.setString(1, "Anton OR 1=1");
//                statement.setString(2, "Koleso");
//
//                boolean execute = statement.execute();
//
//            }





        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
