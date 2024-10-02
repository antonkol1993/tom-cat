package by.education.db;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
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

            URL url = new URL("web\\src\\main\\webapp\\db.properties");
            URLConnection con = url.openConnection();
//
            InputStream stream = con.getInputStream();

            File file = new File("web\\src\\main\\webapp\\db.properties");
            Properties property = new Properties();
            FileInputStream fis;
            fis = new FileInputStream(file);
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
