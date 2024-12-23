package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * A class to demonstrate transaction management in JDBC
 * Here two sql operations are there
 * If both gets successfully occurred then only commit will be done or it will rollback
 */
public class TransactionManagment {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "mysqlpassword";
        Connection connection = null;
        Statement statement = null;

        try {
            // Establish a connection to the database
            connection = DriverManager.getConnection(url, username, password);
            connection.setAutoCommit(false);  // Disable auto-commit

            // Create a statement object to execute queries
            statement = connection.createStatement();

            // Perform multiple SQL operations in a transaction
            String query1 = "INSERT INTO EMPLOYEETABLE (NAME, CITY) VALUES ('Suresh', 'Nadiad')";
            statement.executeUpdate(query1);

            String query2 = "UPDATE EMPLOYEETABLE SET NAME = 'abc', CITY = 'xyz' WHERE ID = 1;";
            statement.executeUpdate(query2);

            // If all operations succeed, commit the transaction
            connection.commit();
            System.out.println("Transaction Committed Successfully");

        } catch (SQLException e) {
            try {
                // If any error occurs, rollback the transaction
                if (connection != null) {
                    connection.rollback();
                    System.out.println("Transaction Rolled Back");
                }
            } catch (SQLException rollbackException) {
                rollbackException.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            try {
                // Restore auto-commit mode to true after transaction completion
                if (connection != null) {
                    connection.setAutoCommit(true);
                    connection.close();
                }
                // Close the resources
                if (statement != null) statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
