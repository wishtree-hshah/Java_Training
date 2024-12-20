package com.jdbc.StudentTable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDAOImpl implements StudentDAO {

    @Override
    public void insertStudent(Connection connection, Student student) throws SQLException {
        String query = "INSERT INTO StudentTable (rollno, name, city) VALUES (?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, student.getRollno());
        preparedStatement.setString(2, student.getName());
        preparedStatement.setString(3, student.getCity());
        preparedStatement.executeUpdate();
        System.out.println("Student inserted successfully.");
    }

    @Override
    public void updateStudent(Connection connection, Student student) throws SQLException {
        String query = "UPDATE StudentTable SET name = ?, city = ? WHERE rollno = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, student.getName());
        preparedStatement.setString(2, student.getCity());
        preparedStatement.setInt(3, student.getRollno());
        preparedStatement.executeUpdate();
        System.out.println("Student updated successfully.");
    }

    @Override
    public void deleteStudent(Connection connection, int rollno) throws SQLException {
        String query = "DELETE FROM StudentTable WHERE rollno = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, rollno);
        preparedStatement.executeUpdate();
        System.out.println("Student deleted successfully.");
    }

    @Override
    public List<Student> getAllStudents(Connection connection) throws SQLException {
        String query = "SELECT * FROM StudentTable";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        List<Student> students = new ArrayList<>();
        while (resultSet.next()) {
            Student student = new Student();
            student.setRollno(resultSet.getInt("rollno"));
            student.setName(resultSet.getString("name"));
            student.setCity(resultSet.getString("city"));
            students.add(student);
        }
        return students;
    }
}

