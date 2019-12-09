package com.satish.oops.demo.beans;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * Defines the scenario to test Bird behaviour
 */
public class BirdTest {

    /**
     * test the singing behaviour of a bird
     */
    @Test
    public void testSing(){
        Bird bird = new Bird();
        String song = bird.sing();
        Assertions.assertEquals("I am singing",song);
    }
}
