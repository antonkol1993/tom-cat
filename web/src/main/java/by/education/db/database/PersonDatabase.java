package by.education.db.database;

import by.education.constants.UsersRole;
import by.education.db.IPerson;
import by.education.db.connector.ConnectorToPlayerDatabase;
import by.education.db.connector.IConnectortoDatabase;
import by.education.objects.Person;
import by.education.objects.Player;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PersonDatabase implements IPerson {
    private static IPerson instance;
    private final IConnectortoDatabase IConnectorPersonDB = ConnectorToPlayerDatabase.getInstance();

    private static final String GET_PERSONS = "SELECT * FROM persons.persons;";

    private PersonDatabase() {
    }

    public static IPerson getInstance() {
        if (instance == null) {
            instance = new PersonDatabase();
        }
        return instance;
    }

    @Override
    public List<Person> getPersonList() {
        try (Connection connection = IConnectorPersonDB.getConnection();
             Statement statement = connection.createStatement()) {

            try (ResultSet resultSet = statement.executeQuery(GET_PERSONS)) {

                List<Person> persons = new ArrayList<>();

                while (resultSet.next()) {
                    int id = Integer.parseInt(resultSet.getString("id"));
                    String username = resultSet.getString("Username");
                    String password = resultSet.getString("Password");
                    String role = resultSet.getString("Role");
                    if (role.equalsIgnoreCase("admin")) {
                        persons.add(new Person(username, password, UsersRole.ADMIN, id));
                    } else if (role.equalsIgnoreCase("user")) {
                        persons.add(new Person(username, password, UsersRole.USER, id));
                    }
                }
                return persons;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void addPerson(Person person) {

    }

    @Override
    public void removePerson(int id) {

    }
}
