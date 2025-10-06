package com.andywall.stocktrading.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * REST controller that provides an Echo API endpoint.
 * This controller accepts string input and returns the same string as output,
 * demonstrating basic API functionality for the stock trading system.
 * 
 * @author Andy Wall
 */
@RestController
@RequestMapping("/api/echo")
public class EchoController {

    /**
     * Echo endpoint that accepts a string parameter via GET request.
     * This method takes a string argument and returns the same string as response.
     * 
     * @param message the string message to echo back
     * @return the same string that was provided as input
     * 
     * Example usage: GET /api/echo?message=Hello World
     * Returns: Hello World
     */
    @GetMapping
    public String echo(@RequestParam("message") String message) {
        // Return the input message unchanged
        return message;
    }

    /**
     * Echo endpoint that accepts a string in the request body via POST request.
     * This method takes a string from the request body and returns the same string as response.
     * 
     * @param message the string message to echo back from request body
     * @return the same string that was provided as input
     * 
     * Example usage: POST /api/echo with body "Hello World"
     * Returns: Hello World
     */
    @PostMapping
    public String echoPost(@RequestBody String message) {
        // Return the input message unchanged
        return message;
    }
}