package by.education.db;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class PlayersConnector implements ConnectionManager{

    private Properties property = new Properties();
    private FileInputStream fis;
    @Override
    public Connection getConnection() {


    try {
//        fis = new FileInputStream("web\\src\\main\\webapp\\db.properties");
        fis = new FileInputStream("web/src/main/webapp/db.properties");
        property.load(fis);

        String jdbcURL = property.getProperty("jdbcURL");
        String username = property.getProperty("username");
        String password = property.getProperty("password");
        System.out.println("jdbcURL: " + jdbcURL
                + ", username: " + username
                + ", PASSWORD: " + password);
    } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }


        return null;
    }

}
