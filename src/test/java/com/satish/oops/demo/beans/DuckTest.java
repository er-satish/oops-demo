package com.satish.oops.demo.beans;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests the behaviour of a duck
 */
public class DuckTest {
    private Duck duck = new Duck();

    /**
     * Tests the sound of a duck
     */
    @Test
    public void testSing(){
        String song = duck.sing();
        Assertions.assertEquals("Quack, quack",song);
    }

    /**
     * Tests that  a duck can swim
     */
    @Test
    public void testSwim(){
        String msg = duck.swim();
        Assertions.assertEquals("i am swimming",msg);
    }

}
