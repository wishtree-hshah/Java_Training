package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
    BTechStudent(@Qualifier("BTechSemester") Semester studentSemester){
        System.out.println("Constructor called");
        this.studentSemester = studentSemester;
    }

    @PostConstruct
    public void doInitialization(){
        System.out.println("BTechStudent.doInitialization()");
    }

    @PreDestroy
    public void doCleanup(){
        System.out.println("BTechStudent.doCleanup()");
    }

    // passing dependency via setter method
    @Autowired
    public void setStudentSemester(@Qualifier("BTechSemester") Semester studentSemester){
        System.out.println("setStudentSemester called");
        this.studentSemester = studentSemester;
    }

    @Override
    public String getCurrentStatus() {
        return this + " is studying the following subject: "
        + studentSemester.getSubjects() + " in semester " + studentSemester.getSemesterNo();
    }
}
