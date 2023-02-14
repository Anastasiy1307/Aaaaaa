package com.example.myapplication;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAddition() {
        assertEquals(30,15+15);
    }

    public void testMultiplication() {
        assertEquals(30,15*2);
    }

    public void testSubtraction() {
        assertEquals(30,60-30);
    }
}