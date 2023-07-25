package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("JUnit 5 Example")
class AppTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("Before all test methods");
    }

    @Test
    @DisplayName("First test")
    void firstTest() {
        System.out.println("First test method");
    }
}