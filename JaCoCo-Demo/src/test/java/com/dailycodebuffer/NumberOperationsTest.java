package com.dailycodebuffer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOperationsTest {

    @Test
    public void addTest()
    {
        NumberOperations numberOperations = new NumberOperations();
        Assertions.assertEquals(15, numberOperations.add(8,7));
    }

    @Test
    public void subTest()
    {
        NumberOperations numberOperations = new NumberOperations();
        Assertions.assertEquals(4, numberOperations.subtract(10,6));
    }
}