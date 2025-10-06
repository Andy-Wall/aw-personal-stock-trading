package com.andywall.stocktrading;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Integration test for the main Spring Boot application.
 * This test verifies that the application context loads successfully.
 * 
 * @author Andy Wall
 */
@SpringBootTest
public class AppTest {

    /**
     * Test that verifies the Spring Boot application context loads without errors.
     * This is a basic smoke test to ensure the application can start up properly.
     */
    @Test
    public void contextLoads() {
        // This test will pass if the application context loads successfully
        // Spring Boot will automatically fail this test if there are configuration issues
    }
}
