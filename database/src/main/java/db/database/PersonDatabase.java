package db.database;

import by.education.constants.UsersRole;
import db.IPerson;
import db.connector.ConnectorToDatabase;
import db.connector.IConnectorToDatabase;
import by.education.objects.Person;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class PersonDatabase implements IPerson {
    private static IPerson instance;
    private final IConnectorToDatabase connectorToDatabase = ConnectorToDatabase.getInstance();
    private List<Person> persons;

    private static final String GET_PERSONS = "SELECT * FROM my_schema.persons;";
    private static final String INSERT_PERSON = "INSERT INTO my_schema.persons" +
            "(userName, password, role) VALUES(?,?,?)";
    private static final String EDIT_PERSON = "UPDATE my_schema.persons " +
            "SET Username = ?, Password = ? " +
            "WHERE id = ?; ";
    private static final String DELETE_PERSON = "DELETE FROM my_schema.persons WHERE id = ?";

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
            try (Connection connection = connectorToDatabase.getConnection();
                 Statement statement = connection.createStatement()) {

                try (ResultSet resultSet = statement.executeQuery(GET_PERSONS)) {

                    List<Person> persons = new ArrayList<>();

                    while (resultSet.next()) {
                        int id = Integer.parseInt(resultSet.getString("id"));
                        String username = resultSet.getString("Username");
                        String password = resultSet.getString("Password");
                        String role = resultSet.getString("Role");
                        if (role.equalsIgnoreCase("admin")) {
                            Person person = new Person()
                                    .withUserName(username)
                                    .withPassword(password)
                                    .withUserRole(UsersRole.USER);
                            person.setId(id) ;
                            persons.add(person);

                        } else if (role.equalsIgnoreCase("user")) {
                            Person person = new Person()
                                    .withUserName(username)
                                    .withPassword(password)
                                    .withUserRole(UsersRole.USER);
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
            Connection connection = connectorToDatabase.getConnection();
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
    public void editPerson(int id, String userName, String password) {

        try {
            Connection connection = connectorToDatabase.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(EDIT_PERSON);
            preparedStatement.setString(1, userName);
            preparedStatement.setString(2, password);
            preparedStatement.setInt(3, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void removePerson(int id) {
        try {
            Connection connection = connectorToDatabase.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PERSON);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
}
