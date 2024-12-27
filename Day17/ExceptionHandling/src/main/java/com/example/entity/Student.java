package com.example.entity;

public class Student {
    private int id;
    private String name;
    private String email;
    private String city;
    private String gender;

    public Student() {
    }

    public Student(int id, String name, String email, String city, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.city = city;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
