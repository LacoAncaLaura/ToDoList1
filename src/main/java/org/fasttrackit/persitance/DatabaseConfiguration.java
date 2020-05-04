package org.fasttrackit.persitance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DatabaseConfiguration {
    public static Connection getConnection() throws SQLException {

        DatabaseConfiguration.class.getClassLoader()
                .getResourceAsStream("db.properties");

        return DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/to_do_list",
                "to-do-list",
                "to-do-list");

    }
}


