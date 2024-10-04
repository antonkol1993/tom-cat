package by.education.db;

import by.education.prop.ListPropertiesToDateBase;
import by.education.prop.PreparedPropertiesEnum;
import by.education.prop.PropertiesToDataBase;

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
            PropertiesToDataBase propertiesToDataBasePlayer = PreparedPropertiesEnum.PROPERTIES_TO_DATA_BASE_PLAYER;

            String jdbcURL = propertiesToDataBasePlayer.getUrlDB();
            String username = propertiesToDataBasePlayer.getUser();
            String password = propertiesToDataBasePlayer.getPassword();
//            System.out.println("jdbcURL: " + jdbcURL
//                    + ", username: " + username
//                    + ", PASSWORD: " + password);
            return DriverManager.getConnection(jdbcURL,
                    username,
                    password);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

}
