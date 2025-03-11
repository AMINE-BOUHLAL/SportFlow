package com.example.sportflow.Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConfig {

    static String url = "jdbc:mysql://localhost:3306/SportFlow";
    static String username = "root";
    static String pass = "";

    public static Connection getCon() throws SQLException {
        return DriverManager.getConnection(url, username, pass);
    }

}
