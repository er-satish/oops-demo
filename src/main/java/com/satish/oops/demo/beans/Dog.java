package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.FlyBehaviour;
import com.satish.oops.demo.behaviour.SoundBehaviour;
import com.satish.oops.demo.behaviour.impl.DogDefaultSoundBehaviour;

/**
 * Defines a Dog based on Animal
 *
 * @see Animal
 */
public class Dog extends Animal {

    public Dog() {
        super(new DogDefaultSoundBehaviour());
    }
}
