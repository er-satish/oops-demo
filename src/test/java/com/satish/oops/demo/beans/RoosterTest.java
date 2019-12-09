package com.satish.oops.demo.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests the behaviour of a rosster
 */
public class RoosterTest {
    private Rooster rooster = new Rooster();

    /**
     * Tests the sound of a rooster
     */
    @Test
    public void testSing() {
        String song = rooster.sing();
        Assertions.assertEquals("Cock-a-doodle-doo", song);
    }

}
