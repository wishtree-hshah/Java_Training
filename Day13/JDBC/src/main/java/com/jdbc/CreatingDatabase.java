package com.jdbc;

import java.sql.*;

public class CreatingDatabase {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "mysqlpassword";
        Connection connection = null;
        Statement statement = null;
        try {
            // Establish connection to the MySQL database
            connection = DriverManager.getConnection(url, username, password);
            // SQL query to select all records from the "student" table
            String q = "CREATE TABLE EMPLOYEETABLE(id INT(20) PRIMARY KEY AUTO_INCREMENT," +
                    "name VARCHAR(50) NOT NULL, city VARCHAR(50))";

            // Create a Statement object to execute the query
            statement = connection.createStatement();

            // Execute the query
            statement.executeUpdate(q);

            System.out.println("Table created in database");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
