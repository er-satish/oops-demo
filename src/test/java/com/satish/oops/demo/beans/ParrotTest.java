package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.impl.DefaultFlyBehaviour;
import com.satish.oops.demo.behaviour.impl.DefaultSoundBehaviour;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Defines the scenario to test parrot behaviour based on it's house mate
 */
public class ParrotTest {

    /**
     * test the singing behaviour of a parrot living with Dog
     */
    @Test
    public void testSing_Dog() {
        Parrot parrot = new Parrot(new Dog());
        Assertions.assertEquals("Woof, woof", parrot.sing());
    }

    /**
     * test the singing behaviour of a parrot living with cat
     */
    @Test
    public void testSing_Cat() {
        Parrot parrot = new Parrot(new Cat());
        Assertions.assertEquals("Meow", parrot.sing());
    }

    /**
     * test the singing behaviour of a parrot living with rooster
     */
    @Test
    public void testSing_Rooster() {
        Parrot parrot = new Parrot(new Rooster());
        Assertions.assertEquals("Cock-a-doodle-doo", parrot.sing());
    }
}
