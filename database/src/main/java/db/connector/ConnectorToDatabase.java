package db.connector;

import constants.Constants;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;


public class ConnectorToDatabase implements IConnectorToDatabase {
    private static ConnectorToDatabase instance;
    private Connection connection;

    private ConnectorToDatabase() {
    }

    public static ConnectorToDatabase getInstance() {
        if (instance == null) {
            instance = new ConnectorToDatabase();
        }
        return instance;
    }

    @Override
    public Connection getConnection() {
            if (connection == null) {
            try {
                Class.forName(Constants.DRIVER_TO_DB);
            } catch (
                    ClassNotFoundException e) {
                throw new RuntimeException("driver not found");
            }
            try {

                Properties property = new Properties();
                InputStream stream = getClass().getResourceAsStream("/db.properties");
                property.load(stream);
                String jdbcURL = property.getProperty("my.schema.jdbcURL");
                String username = property.getProperty("my.schema.username");
                String password = property.getProperty("my.schema.password");
                connection = DriverManager.getConnection(jdbcURL, username, password);

                return connection;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            } finally {
                connection = null;
            }
        }

        return connection;
    }

}
