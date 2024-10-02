package by.education.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static by.education.constants.Constants.DRIVER_TO_DB;

public class ConnectorPlayerDB implements ConnectionManager {


    @Override
    public Connection getConnection() {
        try {
            Class.forName(DRIVER_TO_DB);
        } catch (
                ClassNotFoundException e) {
            throw new RuntimeException("driver not found");
        }
        try {
            Properties property = new Properties();
            FileInputStream fis;
            fis = new FileInputStream("web\\src\\main\\webapp\\db.properties");
            property.load(fis);

            String jdbcURL = property.getProperty("jdbcURL");
            String username = property.getProperty("username");
            String password = property.getProperty("password");
//            System.out.println("jdbcURL: " + jdbcURL
//                    + ", username: " + username
//                    + ", PASSWORD: " + password);
            return DriverManager.getConnection(jdbcURL,
                    username,
                    password);
        } catch (IOException | SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

}
