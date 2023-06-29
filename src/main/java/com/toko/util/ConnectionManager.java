package com.toko.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
    public static final String URL =
            "jdbc:mysql://localhost:3306/toko";
    public static final String USERNAME = "toko";
    public static final String PASSWORD = "toko123!!";
    private static final ConnectionManager instance;

    static {
        instance = new ConnectionManager();
    }

    private ConnectionManager() {
    }

    public static ConnectionManager getInstance() {
        return instance;
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}
