package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.SoundBehaviour;
import com.satish.oops.demo.behaviour.impl.CatDefaultSoundBehaviour;

/**
 * Defines a Cat based on Animal
 *
 * @see Animal
 */
public class Cat extends Animal {
    public Cat() {
        super(new CatDefaultSoundBehaviour());
    }
}
