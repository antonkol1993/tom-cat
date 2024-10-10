package by.education.db.connector;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static by.education.constants.Constants.DRIVER_TO_DB;

public class ConnectorToPlayerDatabase implements IConnectortoDatabase {
    private static ConnectorToPlayerDatabase instance;
    private Connection connection;

    private ConnectorToPlayerDatabase() {
    }

    public static ConnectorToPlayerDatabase getInstance() {
        if (instance == null) {
            instance = new ConnectorToPlayerDatabase();
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
                InputStream stream = getClass().getResourceAsStream("/db.properties");
                property.load(stream);
                String jdbcURL = property.getProperty("player.jdbcURL");
                String username = property.getProperty("player.username");
                String password = property.getProperty("player.password");
                connection = DriverManager.getConnection(jdbcURL, username, password);

                return connection;

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return connection;
    }

}
