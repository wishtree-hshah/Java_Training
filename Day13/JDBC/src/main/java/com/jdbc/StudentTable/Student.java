package com.jdbc.StudentTable;

/**
 * Bean class to represent a Student entity.
 */
public class Student {
    private int rollno;
    private String name;
    private String city;

    // Getters and Setters
    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student [Roll No=" + rollno + ", Name=" + name + ", City=" + city + "]";
    }
}
