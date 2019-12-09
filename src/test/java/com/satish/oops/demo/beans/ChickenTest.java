package com.satish.oops.demo.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests the behaviour of a chicken
 */
public class ChickenTest {
    private Chicken chicken = new Chicken();

    /**
     * Tests the sound of a duck
     */
    @Test
    public void testSing(){
        String song = chicken.sing();
        Assertions.assertEquals("Cluck, cluck",song);
    }

    /**
     * Tests that  a chicken cannot fly
     */
    @Test
    public void testFly(){
        String msg = chicken.fly();
        Assertions.assertEquals("i cannot fly",msg);
    }

}
