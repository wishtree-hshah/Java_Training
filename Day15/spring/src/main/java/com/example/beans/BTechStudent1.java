package com.example.beans;

public class BTechStudent1 implements Student{
    @Override
    public String getCurrentStatus() {
        return this + " is studying in 6th semester (BTechStudent1)";
    }
}
