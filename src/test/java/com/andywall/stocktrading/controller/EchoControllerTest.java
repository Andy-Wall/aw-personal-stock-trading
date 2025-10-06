package com.andywall.stocktrading.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
 * Unit tests for the EchoController class.
 * These tests verify that the Echo API endpoints work correctly
 * for both GET and POST requests with different input scenarios.
 * 
 * @author Andy Wall
 */
@WebMvcTest(EchoController.class)
public class EchoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    /**
     * Test the GET echo endpoint with a simple string message.
     * Verifies that the endpoint returns the exact same string that was sent.
     */
    @Test
    public void testEchoGetEndpoint() throws Exception {
        String testMessage = "Hello World";
        
        mockMvc.perform(get("/api/echo")
                .param("message", testMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(testMessage));
    }

    /**
     * Test the GET echo endpoint with a message containing special characters.
     * Verifies that special characters are handled correctly.
     */
    @Test
    public void testEchoGetEndpointWithSpecialCharacters() throws Exception {
        String testMessage = "Hello, World! @#$%^&*()";
        
        mockMvc.perform(get("/api/echo")
                .param("message", testMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(testMessage));
    }

    /**
     * Test the GET echo endpoint with an empty string.
     * Verifies that empty strings are handled correctly.
     */
    @Test
    public void testEchoGetEndpointWithEmptyString() throws Exception {
        String testMessage = "";
        
        mockMvc.perform(get("/api/echo")
                .param("message", testMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(testMessage));
    }

    /**
     * Test the POST echo endpoint with a simple string message.
     * Verifies that the endpoint returns the exact same string that was sent in the request body.
     */
    @Test
    public void testEchoPostEndpoint() throws Exception {
        String testMessage = "Hello from POST";
        
        mockMvc.perform(post("/api/echo")
                .contentType(MediaType.TEXT_PLAIN)
                .content(testMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(testMessage));
    }

    /**
     * Test the POST echo endpoint with a longer message.
     * Verifies that longer strings are handled correctly.
     */
    @Test
    public void testEchoPostEndpointWithLongMessage() throws Exception {
        String testMessage = "This is a longer message to test the POST echo endpoint functionality. " +
                           "It contains multiple sentences and should be returned exactly as sent.";
        
        mockMvc.perform(post("/api/echo")
                .contentType(MediaType.TEXT_PLAIN)
                .content(testMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(testMessage));
    }

    /**
     * Test the POST echo endpoint with JSON-like content.
     * Verifies that structured text content is handled correctly.
     */
    @Test
    public void testEchoPostEndpointWithJsonContent() throws Exception {
        String testMessage = "{\"message\": \"Hello JSON\", \"number\": 123}";
        
        mockMvc.perform(post("/api/echo")
                .contentType(MediaType.TEXT_PLAIN)
                .content(testMessage))
                .andExpect(status().isOk())
                .andExpect(content().string(testMessage));
    }
}