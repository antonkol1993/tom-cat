package by.education.db.connector;

import java.sql.Connection;

public interface IConnectorToDatabase {

    Connection getConnection();
}