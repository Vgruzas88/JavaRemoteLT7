package basics;

import org.junit.jupiter.api.*;

import javax.xml.ws.soap.Addressing;

public class TestAnnotations {

    @BeforeAll
    public static void setUp() {
        System.out.println("This message will be displayed once before executing any test methods.");
    }

    @BeforeEach
    public void init() {
        System.out.println("This message will be displayed before each test method.");
    }

    @AfterAll
    public static void tearDown() {
        System.out.println("This message will be displayed after executing all tests...");
    }

    @AfterEach
    public void tear() {
        System.out.println("This message will be displayed after executing every method.");
    }

    @Test
    public void firstTest() {
        System.out.println("Executing first test...");
    }

    @Test
    public void secondTest() {
        System.out.println("Executing second test...");
    }

    @Test
    @DisplayName("Third Test")
    public void thirdTest() {
        System.out.println("Executing third test...");
    }

    @Test
    @Disabled
    public void fourthTest() {
        System.out.println("Executing fourth test...");
    }
}
