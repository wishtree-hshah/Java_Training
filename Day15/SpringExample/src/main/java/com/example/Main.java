package com.example;

import com.example.beans.Student;
import com.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student1 = applicationContext.getBean(Student.class);
        System.out.println(student1.getCurrentStatus());
        ((ConfigurableApplicationContext)applicationContext).close();
    }
}
