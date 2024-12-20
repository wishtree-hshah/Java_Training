package com.jdbc.StudentTable;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public interface StudentDAO {
    void insertStudent(Connection connection, Student student) throws SQLException;
    void updateStudent(Connection connection, Student student) throws SQLException;
    void deleteStudent(Connection connection, int rollno) throws SQLException;
    List<Student> getAllStudents(Connection connection) throws SQLException;
}
