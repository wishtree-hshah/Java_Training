package com.jdbc.StudentTable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class CrudOperationsWithDAOAndBean {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "mysqlpassword";
        Connection connection = null;
        BufferedReader bufferedReader = null;

        try {
            // Initialize DAO
            StudentDAO studentDAO = new StudentDAOImpl();

            // Establish database connection
            connection = DriverManager.getConnection(url, username, password);
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                System.out.println("\n--- CRUD Operations ---");
                System.out.println("1. Insert Student");
                System.out.println("2. Update Student");
                System.out.println("3. Delete Student");
                System.out.println("4. Display All Students");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                int choice = Integer.parseInt(bufferedReader.readLine());

                Student student = new Student();
                int rollno;

                switch (choice) {
                    case 1:
                        System.out.print("Enter Roll No: ");
                        student.setRollno(Integer.parseInt(bufferedReader.readLine()));
                        System.out.print("Enter Name: ");
                        student.setName(bufferedReader.readLine());
                        System.out.print("Enter City: ");
                        student.setCity(bufferedReader.readLine());
                        studentDAO.insertStudent(connection, student);
                        break;

                    case 2:
                        System.out.print("Enter Roll No to Update: ");
                        student.setRollno(Integer.parseInt(bufferedReader.readLine()));
                        System.out.print("Enter New Name: ");
                        student.setName(bufferedReader.readLine());
                        System.out.print("Enter New City: ");
                        student.setCity(bufferedReader.readLine());
                        studentDAO.updateStudent(connection, student);
                        break;

                    case 3:
                        System.out.print("Enter Roll No to Delete: ");
                        rollno = Integer.parseInt(bufferedReader.readLine());
                        studentDAO.deleteStudent(connection, rollno);
                        break;

                    case 4:
                        List<Student> students = studentDAO.getAllStudents(connection);
                        System.out.println("\n--- Student Records ---");
                        for (Student s : students) {
                            System.out.println(s);
                        }
                        break;

                    case 5:
                        System.out.println("Exiting application...");
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) bufferedReader.close();
                if (connection != null) connection.close();
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
