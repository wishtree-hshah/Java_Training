package com.jdbc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

/**
 * CRUD Application using JDBC to manage employee records in a mysql database
 */
public class CrudOperations {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "mysqlpassword";
        Connection connection = null;
        BufferedReader bufferedReader = null;

        try {
            // Establish connection to the MySQL database
            connection = DriverManager.getConnection(url, username, password);

            // Menu loop for performing CRUD operations
            while (true) {
                System.out.println("Select Option to do operations:");
                System.out.println("1. Insert");
                System.out.println("2. Update");
                System.out.println("3. Delete");
                System.out.println("4. Show Table");
                System.out.println("5. Exit");
                int option;
                bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                System.out.printf("Enter option: ");
                option = Integer.parseInt(bufferedReader.readLine());
                String name, city;
                int id;
                switch (option) {
                    case 1:
                        // Insert operations
                        System.out.print("Enter Name: ");
                        name = bufferedReader.readLine();
                        System.out.printf("Enter City: ");
                        city = bufferedReader.readLine();
                        insert(connection, name, city);
                        break;
                    case 2:
                        // Update operation
                        System.out.printf("Enter ID: ");
                        id = Integer.parseInt(bufferedReader.readLine());
                        System.out.print("Enter Name: ");
                        name = bufferedReader.readLine();
                        System.out.printf("Enter City: ");
                        city = bufferedReader.readLine();
                        update(connection, name, city, id);
                        break;
                    case 3:
                        // Delete operation
                        System.out.printf("Enter ID: ");
                        id = Integer.parseInt(bufferedReader.readLine());
                        delete(connection, id);
                        break;
                    case 4:
                        // Display all records
                        showData(connection);
                        break;
                    case 5:
                        // Exit the application
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option selected. Try Again!!");
                        break;
                }
            }
        } catch (SQLException | IOException exception) {
            exception.printStackTrace();
        } finally {
            try {
                // Close resources
                if (bufferedReader != null) bufferedReader.close();
                if (connection != null) connection.close();
            } catch (SQLException | IOException sqlException) {
                sqlException.printStackTrace();
            }
        }
    }

    /**
     * Insert a new record to EmployeeTable
     * @param connection
     * @param name
     * @param city
     */
    public static void insert(Connection connection, String name, String city) {
        try {
            // SQL query to insert a new record into the table
            String query = "INSERT INTO EMPLOYEETABLE(NAME, CITY) VALUES(?, ?)";
            // Prepare the SQL statement with placeholders to prevent SQL injection
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Set the name parameter in the query
            preparedStatement.setString(1, name);
            // Set the city parameter in the query
            preparedStatement.setString(2, city);
            // Execute the insert query
            preparedStatement.executeUpdate();
            System.out.println("Values Inserted");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Updates an existing record in the EmployeeTable
     * @param connection
     * @param name
     * @param city
     * @param id
     */
    public static void update(Connection connection, String name, String city, int id) {
        try {
            // SQL query to update the record in the table
            String query = "UPDATE EMPLOYEETABLE SET name = ?, city = ? WHERE id = ?";
            // Prepare the SQL statement with placeholders to prevent SQL injection
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Set the name parameter in the query
            preparedStatement.setString(1, name);
            // Set the city parameter in the query
            preparedStatement.setString(2, city);
            // Set the ID parameter in the query for the record to update
            preparedStatement.setInt(3, id);
            // Execute the update query
            preparedStatement.executeUpdate();
            System.out.println("Values Updated");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Deletes a record from the EmployeeTable
     * @param connection
     * @param id
     */
    public static void delete(Connection connection, int id) {
        try {
            // SQL query to delete a record with a specific ID
            String query = "DELETE FROM EMPLOYEETABLE WHERE id = ?";
            // Prepare the SQL statement with a placeholder for the ID
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            // Set the ID parameter in the query
            preparedStatement.setInt(1, id);
            // Execute the delete query
            preparedStatement.executeUpdate();
            System.out.println("Record Deleted");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    /**
     * Displays all records from the EmployeeTable
     * @param connection
     */
    public static void showData(Connection connection) {
        try {
            // SQL query to fetch all records from the table
            String query = "SELECT * FROM EMPLOYEETABLE";
            // Create a Statement object to execute the query
            Statement statement = connection.createStatement();
            // Execute the query and store the result set
            ResultSet resultSet = statement.executeQuery(query);
            // Iterate through the result set and print each record
            while (resultSet.next()) {
                System.out.println("ID: " + resultSet.getInt(1) + // Retrieve and display ID
                        ", Name: " + resultSet.getString(2) +     // Retrieve and display Name
                        ", City: " + resultSet.getString(3));     // Retrieve and display City
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
