package com.jdbc;

import java.sql.*;

public class DatabseConnection {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "mysqlpassword";
        // Establish connection to the MySQL database
        Connection connection = DriverManager.getConnection(url, username, password);

        // SQL query to select all records from the "student" table
        String q = "SELECT * FROM student";

        // Create a Statement object to execute the query
        Statement statement = connection.createStatement();

        // Execute the query and get the result set
        ResultSet resultSet = statement.executeQuery(q);

        // Iterate over the result set
        while (resultSet.next()){
            // Retrieve the "student_name" column value for the current row
            String name = resultSet.getString("student_name");
            System.out.println(name);
        }
    }
}
