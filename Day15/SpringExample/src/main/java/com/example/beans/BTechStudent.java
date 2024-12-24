package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BTechStudent implements Student{
    Semester studentSemester;

    /**
     * Dependency injection via constructor
     * Autowired means spring will connect beans automatically
     * @param studentSemester
     */
    @Autowired
    BTechStudent(@Qualifier("MTechSemester") Semester studentSemester){
        System.out.println("Constructor called");
        this.studentSemester = studentSemester;
    }

    // passing dependency via setter method
    @Autowired
    public void setStudentSemester(@Qualifier("MTechSemester") Semester studentSemester){
        System.out.println("setStudentSemester called");
        this.studentSemester = studentSemester;
    }

    @Override
    public String getCurrentStatus() {
        return this + " is studying the following subject: "
        + studentSemester.getSubjects() + " in semester " + studentSemester.getSemesterNo();
    }
}
