// File: src/test/java/com/example/test/CalculatorTest.java
package com.example.test;

import com.example.Calc;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalcTest {

    private Calc calc;

    @Before
    public void setUp() {
        // ✅ Arrange: Initialize before each test
        calc = new Calc();
        System.out.println("Setup complete");
    }

    @After
    public void tearDown() {
        // ✅ Cleanup after each test
        calc = null;
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        // ✅ Arrange
        int a = 5;
        int b = 3;

        // ✅ Act
        int result = calc.add(a, b);

        // ✅ Assert
        assertEquals(8, result);
    }

    @Test
    public void testSubtraction() {
        // ✅ Arrange
        int a = 10;
        int b = 4;

        // ✅ Act
        int result = calc.subtract(a, b);

        // ✅ Assert
        assertEquals(6, result);
    }
}
