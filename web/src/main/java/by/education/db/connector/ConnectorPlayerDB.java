package by.education.db.connector;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

import static by.education.constants.Constants.DRIVER_TO_DB;

public class ConnectorPlayerDB implements IConnectorPersonDB {
    private static ConnectorPlayerDB instance;
    private Connection connection;

    private ConnectorPlayerDB() {
    }

    public static ConnectorPlayerDB getInstance() {
        if (instance == null) {
            instance = new ConnectorPlayerDB();
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
//            PropertiesToDataBase playerPropertiesToDataBase = PreparedPropertiesEnum.PROPERTIES_TO_DATA_BASE_PLAYER;
//
//
//
//            String jdbcURL = playerPropertiesToDataBase.getUrlDB();
//            String username = playerPropertiesToDataBase.getUser();
//            String password = playerPropertiesToDataBase.getPassword();

                Properties property = new Properties();
                InputStream stream = getClass().getResourceAsStream("db.properties");
                property.load(stream);
                String jdbcURL = property.getProperty("jdbcURL");
                String username = property.getProperty("username");
                String password = property.getProperty("password");

//            System.out.println("jdbcURL: " + jdbcURL
//                    + ", username: " + username
//                    + ", PASSWORD: " + password);
                return DriverManager.getConnection(jdbcURL,
                        username,
                        password);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

        return connection;
    }

}
