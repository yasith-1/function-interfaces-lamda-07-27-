package edu.icet.demoervice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  //Marks this class as a Spring Boot application
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class);  //IOC container is created and the application starts
    }
}