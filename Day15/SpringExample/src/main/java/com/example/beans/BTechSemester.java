package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BTechSemester implements Semester{
    public BTechSemester(){
        System.out.println("Constructor BTechSemester() called");
    }
    @PostConstruct
    public void doInitialization(){
        System.out.println("BTechSemester.doInitialization()");
    }

    @PreDestroy
    public void doCleanup(){
        System.out.println("BTechSemester.doCleanup()");
    }

    @Override
    public String getSemesterNo() {
        return "8";
    }

    @Override
    public String getSubjects() {
        return "Java, SpringBoot";
    }
}
