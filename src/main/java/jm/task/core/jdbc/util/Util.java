package jm.task.core.jdbc.util;

import java.sql.*;

public class Util {

    private static final String URL = "jdbc:mysql://localhost:3306/mysql";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private Connection connection;

    public Util() {

        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
//            connection.close();
        } catch (SQLException ex) {
            System.out.println("Connection failed...");
            ex.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }
}
