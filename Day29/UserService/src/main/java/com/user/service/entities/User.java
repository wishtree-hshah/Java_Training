package com.user.service.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
public class User {
    @Id
    @Column(name = "id")
    private String userId;
    private String name;
    private String email;
    private String about;

    public User() {
    }

    public User(String userId, String name, String email, String about) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.about = about;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
