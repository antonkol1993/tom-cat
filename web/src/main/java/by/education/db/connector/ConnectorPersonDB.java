package by.education.db.connector;


import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import static by.education.constants.Constants.DRIVER_TO_DB;

public class ConnectorPersonDB implements IConnectorPersonDB {
    private static ConnectorPersonDB instance;
    private Connection connection;

    private ConnectorPersonDB() {
    }

    public static ConnectorPersonDB getInstance() {
        if (instance == null) {
            instance = new ConnectorPersonDB();
        }
        return instance;
    }

    @Override
    public Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName(DRIVER_TO_DB);
            } catch (
                    ClassNotFoundException e) {
                throw new RuntimeException("driver not found");
            }
            try {

                Properties property = new Properties();
                InputStream stream = getClass().getResourceAsStream("db.properties");
                property.load(stream);
                String jdbcURL = property.getProperty("jdbcURL");
                String username = property.getProperty("username");
                String password = property.getProperty("password");
                connection = DriverManager.getConnection(jdbcURL, username, password);
                return connection;

            } catch (SQLException e) {
                System.err.println(e.getMessage());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return connection;
    }

}
