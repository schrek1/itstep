package cz.itstep;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifecycleTest {

    @BeforeAll
    static void beforeAll() {
        System.out.println("beforeAll...");
    }


    @BeforeEach
    void setUp() {
        System.out.println("BeforeEach...");
    }


    @Test
    void firstTest() {
        System.out.println("performing first test...");
    }

    @Test
    void secondTest() {
        System.out.println("performing second test...");
    }


    @AfterEach
    void tearDown() {
        System.out.println("tearDown...");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("afterAll...");
    }
}
