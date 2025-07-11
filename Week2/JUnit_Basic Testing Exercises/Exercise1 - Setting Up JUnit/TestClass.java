package com;  // or use your package name like com.example.test

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClass {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals(5, result);
    }
}
