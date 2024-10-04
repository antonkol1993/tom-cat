package by.education.db;

import by.education.prop.DB.PreparedPropertiesEnum;
import by.education.prop.DB.PropertiesToDataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static by.education.constants.Constants.DRIVER_TO_DB;

public class ConnectorPersonDB implements ConnectionManager {


    @Override
    public Connection getConnection() {
        try {
            Class.forName(DRIVER_TO_DB);
        } catch (
                ClassNotFoundException e) {
            throw new RuntimeException("driver not found");
        }
        try {
            PropertiesToDataBase personPropertiesToDataBase = PreparedPropertiesEnum.PROPERTIES_TO_DATA_BASE_PERSON;

            String jdbcURL = personPropertiesToDataBase.getUrlDB();
            String username = personPropertiesToDataBase.getUser();
            String password = personPropertiesToDataBase.getPassword();
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
