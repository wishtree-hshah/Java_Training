package com.test.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Assertion: validating actual result with expected result
 */
public class AssertExample {
    @Test
    public void test1(){
        System.out.println("Testing some assertion methods...");
        // Test equality of two integers
        int actual = 12;
        int expected = 12;
        Assertions.assertEquals(expected, actual);

        // Test equality of two arrays
        int[] actualArray = {1, 2, 3, 4, 5};
        int[] expectedArray = {1, 2, 3, 4, 5};
        Assertions.assertArrayEquals(expectedArray, actualArray);

        // Test object references and equality
        String actualName = new String("abc");
        String expectedName = new String("abc");
        Assertions.assertSame(expectedName, actualName); // Checks if both refer to the same object
        Assertions.assertEquals(expectedName, actualName); // Checks if values are equal

        // Test if a condition is true
        boolean value = true;
        Assertions.assertTrue(value);

        // Test equality of two lists
        List<Integer> actualList = Arrays.asList(1, 2, 3, 4);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4);
        Assertions.assertIterableEquals(actualList, expectedList);

        // Test if an exception is thrown
        Assertions.assertThrows(RuntimeException.class, () -> {
            throw new RuntimeException("This is testing exception");
        });
    }
}
