package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// tells the spring that this is configuration class
@Configuration
// tells spring that various components are available in this class
@ComponentScan(basePackages = "com.example")
public class AppConfig {
}
