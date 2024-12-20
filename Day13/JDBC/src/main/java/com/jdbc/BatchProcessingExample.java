package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *  batch processing in JDBC to insert multiple records into a database
 */
public class BatchProcessingExample {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "mysqlpassword";
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            // Establish a connection to the database
            connection = DriverManager.getConnection(url, username, password);

            // SQL query for inserting employee records
            String query = "INSERT INTO EMPLOYEETABLE (NAME, CITY) VALUES (?, ?)";

            // Create a PreparedStatement to execute the batch
            preparedStatement = connection.prepareStatement(query);

            // Turn off auto-commit to ensure that the transaction is managed manually
            connection.setAutoCommit(false);

            // Add multiple records to the batch
            preparedStatement.setString(1, "Ramesh");
            preparedStatement.setString(2, "Vadodara");
            preparedStatement.addBatch(); // Add first record to the batch

            preparedStatement.setString(1, "Rekha");
            preparedStatement.setString(2, "Rajkot");
            preparedStatement.addBatch(); // Add second record to the batch

            preparedStatement.setString(1, "Aneri");
            preparedStatement.setString(2, "Bharuch");
            preparedStatement.addBatch(); // Add third record to the batch

            // Execute the batch of SQL statements
            int[] result = preparedStatement.executeBatch();

            // Commit the transaction
            connection.commit();

            System.out.println("Batch Processing Completed.");

            // Print the number of rows affected by each statement in the batch
            for (int i : result) {
                System.out.println("Rows affected: " + i);
            }

        } catch (SQLException e) {
            try {
                // If there is an error, roll back the transaction
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
                // Restore auto-commit mode to true after the batch processing
                if (connection != null) {
                    connection.setAutoCommit(true);
                }
                // Close resources
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

