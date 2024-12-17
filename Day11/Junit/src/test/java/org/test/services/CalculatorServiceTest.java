package org.test.services;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

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
     * Test method of addTwoNumbersTest
     */
    @Test
    public void addTwoNumbersTest(){
        System.out.println("Test for addTwoNumbersTest...");
        int result = CalculatorService.addTwoNumbers(12,45);
        int expected = 57;
        Assert.assertEquals(expected,result);
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
     *
     */
    @AfterClass
    public void cleanUp(){

    }
}
