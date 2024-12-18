package org.test.services;

import org.junit.*;
import java.util.Date;

public class CalculatorServiceTest {
    /**
     * This method will run before any test method starts execution
     */
    @BeforeClass
    public static void init(){
        System.out.println("Before all test cases: ");
        System.out.println("Started test: " + new Date());
    }

    /**
     * Will be executed before each test case
     */
    @Before
    public void beforeEach(){
        System.out.println("Before each test case...");
    }

    /**
     * Will be executed after each test case
     */
    @After
    public void afterEach(){
        System.out.println("After each test case...");
    }

    /**
     * Test method of addTwoNumbersTest
     * if this testcase takes more than 2 sec than test fails
     */
    @Test(timeout=2000)
    public void addTwoNumbersTest() throws InterruptedException {
        System.out.println("Test for addTwoNumbersTest...");
        int result = CalculatorService.addTwoNumbers(12,45);
        int expected = 57;
        Assert.assertEquals(expected,result);
        Thread.sleep(3000);
    }

    /**
     * Test method of sumAnyNumberTest
     */
    @Test
    public void sumAnyNumberTest(){
        System.out.println("Test for sumAnyNumberTest...");
        int result = CalculatorService.sumAnyNumbers(2,7,8,6);
        int expectedResult = 23;
        Assert.assertEquals(expectedResult,result);
    }

    /**
     * Will be executed after all test cases
     */
    @AfterClass
    public static void cleanUp(){
        System.out.println("After all test cases");
        System.out.println("End test cases: " + new Date());
    }
}
