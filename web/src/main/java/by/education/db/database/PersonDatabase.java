package by.education.db.database;

import by.education.constants.UsersRole;
import by.education.db.IPerson;
import by.education.db.connector.ConnectorToPlayerDatabase;
import by.education.db.connector.IConnectortoDatabase;
import by.education.objects.Person;
import by.education.service.PersonService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PersonDatabase implements IPerson {
    private static IPerson instance;
    private final IConnectortoDatabase connectorPersonDB = ConnectorToPlayerDatabase.getInstance();
    private List<Person> persons;

    private static final String GET_PERSONS = "SELECT * FROM persons.persons;";
    private static final String INSERT_PERSON = "INSERT INTO persons.persons" +
            "(userName, password, role) VALUES(?,?,?)";
    private static final String EDIT_PERSON = "UPDATE persons.persons " +
            "SET Username = ?, Password = ? " +
            "WHERE id = ?; ";

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
        if (persons == null) {
            try (Connection connection = connectorPersonDB.getConnection();
                 Statement statement = connection.createStatement()) {

                try (ResultSet resultSet = statement.executeQuery(GET_PERSONS)) {

                    List<Person> persons = new ArrayList<>();

                    while (resultSet.next()) {
                        int id = Integer.parseInt(resultSet.getString("id"));
                        String username = resultSet.getString("Username");
                        String password = resultSet.getString("Password");
                        String role = resultSet.getString("Role");
                        if (role.equalsIgnoreCase("admin")) {
                            Person person = new Person(username, password, UsersRole.ADMIN);
                            person.setId(id) ;
                            persons.add(person);

                        } else if (role.equalsIgnoreCase("user")) {
                            Person person = new Person(username, password, UsersRole.USER);
                            person.setId(id) ;
                            persons.add(person);
                        }
                    }
                    return persons;

                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        } else return persons;
    }

    @Override
    public void addPerson(Person person) {

        try {
            Connection connection = connectorPersonDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PERSON);
            preparedStatement.setString(1,person.getUserName());
            preparedStatement.setString(2,person.getPassword());
            preparedStatement.setString(3,person.getUserRole().name());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void editPerson(Person person) {

        try {
            Connection connection = connectorPersonDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(EDIT_PERSON);
            preparedStatement.setString(1, person.getUserName());
            preparedStatement.setString(2, person.getPassword());
            preparedStatement.setInt(3, person.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removePerson(int id) {

    }

}
