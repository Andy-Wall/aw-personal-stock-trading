package com.andywall.stocktrading;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for the Echo API Spring Boot application.
 * This class serves as the entry point for the application and configures
 * Spring Boot auto-configuration.
 * 
 * @author Andy Wall
 */
@SpringBootApplication
public class App 
{
    /**
     * Main method that starts the Spring Boot application.
     * 
     * @param args command line arguments passed to the application
     */
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
