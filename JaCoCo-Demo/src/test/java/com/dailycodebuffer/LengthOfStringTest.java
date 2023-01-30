package com.dailycodebuffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfStringTest {

    @Test
    public void testLengthMethod()
    {
        LengthOfString lengthOfString = new LengthOfString();
        assertEquals(true,lengthOfString.checkLength("yes"));
        assertEquals(false,lengthOfString.checkLength("no"));
    }
}