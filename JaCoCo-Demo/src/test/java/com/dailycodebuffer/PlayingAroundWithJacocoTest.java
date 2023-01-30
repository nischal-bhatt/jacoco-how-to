package com.dailycodebuffer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayingAroundWithJacocoTest {

    @Test
    public void testString()
    {
        PlayingAroundWithJacoco playingAroundWithJacoco = new PlayingAroundWithJacoco();
        assertEquals(true,playingAroundWithJacoco.testString("nischal"));
    }

    @Test
    public void testString2()
    {
        PlayingAroundWithJacoco playingAroundWithJacoco = new PlayingAroundWithJacoco();
        assertEquals(false,playingAroundWithJacoco.testString("nischala"));
    }
}