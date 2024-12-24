package com.example;

import com.example.beans.Student;
import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student1 = (Student) applicationContext.getBean("BTechStudent");
        System.out.println(student1.getCurrentStatus());

        Student student2 = (Student) applicationContext.getBean("BTechStudent");
        System.out.println(student2.getCurrentStatus());

        ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring-config.xml");
        Student student3 = (Student) applicationContext1.getBean("btechStudentBean");
        Student student4 = (Student) applicationContext1.getBean("btechStudentBean");
        System.out.println(student3.getCurrentStatus());
        System.out.println(student4.getCurrentStatus());
    }
}
