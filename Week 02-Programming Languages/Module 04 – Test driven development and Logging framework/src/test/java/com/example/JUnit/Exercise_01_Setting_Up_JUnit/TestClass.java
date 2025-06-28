package com.example.JUnit.Exercise_01_Setting_Up_JUnit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestClass {

    @Test
    public void testAddition() {
        int result = 2 + 3;
        assertEquals("Addition should be 5", 5, result);
    }
}
