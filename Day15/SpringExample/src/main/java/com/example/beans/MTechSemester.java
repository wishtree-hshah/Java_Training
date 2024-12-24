package com.example.beans;

import jdk.jfr.Label;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class MTechSemester implements Semester{
    public MTechSemester(){
        System.out.println("Constructor MTechSemester() called");
    }
    @Override
    public String getSemesterNo() {
        return "4";
    }

    @Override
    public String getSubjects() {
        return "Python";
    }
}
