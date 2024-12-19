package com.test.services;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.lang.reflect.Method;

public class CalculatorServiceTest {
    /**
     * This method will run before any test method starts execution
     */
    @BeforeAll
    public static void init(){
        System.out.println("This is single time logic at init..");
    }

    /**
     * Will be executed after all test cases
     */
    @AfterAll
    public static void cleanUp(){
        System.out.println("After all test case logic");
    }

    /**
     * Will be executed before each test case
     */
    @BeforeEach
    public void beforeEach(){
        System.out.println("Before each test case...");
    }

    /**
     * Will be executed after each test case
     */
    @AfterEach
    public void afterEach(){
        System.out.println("After each test case...");
    }

    /**
     * Test method of addTwoNumbersTest
     */
    @Test
    @DisplayName("This is custom name")
    public void addTwoNumbersTest(){
        System.out.println("Test for addTwoNumbersTest...");
        int actualResult = CalculatorService.addTwoNumbers(7,8);
        int expectedResult = 15;
        Assertions.assertEquals(expectedResult,actualResult,"Test Failed");
    }

    @Test
    public void productTwoNumbersTest(){
        CalculatorService calculatorService = new CalculatorService();
        try {
            Method privateMethod = CalculatorService.class.getDeclaredMethod("productTwoNumbers",int.class,int.class);
            privateMethod.setAccessible(true);
            Object result = privateMethod.invoke(calculatorService,3,4);
            Assertions.assertEquals(12,result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * This test will run multiple times with different values for the second number
     * @param secondNumber
     */
    @ParameterizedTest
    @ValueSource(ints = {2, 5, 10, 20, 50})
    @DisplayName("Parameterized Test for addTwoNumbers with a fixed first number")
    public void parameterizedAddTwoNumbersTest(int secondNumber) {
        System.out.println("Test for parameterized for adding two numbers...");
        int firstNumber = 10;
        int actualResult = CalculatorService.addTwoNumbers(firstNumber, secondNumber);
        int expected = firstNumber + secondNumber;
        Assertions.assertEquals(expected, actualResult, "Test Failed");
    }

    /**
     * Test method of sumAnyNumberTest
     */
    @Test
    @Disabled
    public void sumAnyNumberTest(){
        System.out.println("Test for sumAnyNumberTest...");
        int actualResult = CalculatorService.sumAnyNumbers(1,2,3,4);
        int expectedResult = 10;
        Assertions.assertEquals(expectedResult,actualResult);
    }
}
