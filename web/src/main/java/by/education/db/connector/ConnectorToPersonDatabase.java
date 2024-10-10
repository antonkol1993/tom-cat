package by.education.db.connector;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static by.education.constants.Constants.DRIVER_TO_DB;

public class ConnectorToPersonDatabase implements IConnectortoDatabase {
    private static ConnectorToPersonDatabase instance;
    private Connection connection;

    private ConnectorToPersonDatabase() {
    }

    public static ConnectorToPersonDatabase getInstance() {
        if (instance == null) {
            instance = new ConnectorToPersonDatabase();
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
                String jdbcURL = property.getProperty("person.jdbcURL");
                String username = property.getProperty("person.username");
                String password = property.getProperty("person.password");
                connection = DriverManager.getConnection(jdbcURL, username, password);

                return connection;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return connection;
    }

}
