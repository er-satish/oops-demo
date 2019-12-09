package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.impl.CluckSoundBehaviour;
import com.satish.oops.demo.behaviour.impl.DefaultFlyBehaviour;
import com.satish.oops.demo.behaviour.impl.DefaultSoundBehaviour;
import com.satish.oops.demo.behaviour.impl.NoFlyBehaviour;

/**
 * Defines a parrot based on Bird
 *
 * @see Bird
 */
public class Parrot extends Bird {

    private Animal houseMate;

    /**
     * Create a Parrot
     *
     * @param houseMate
     */
    public Parrot(Animal houseMate) {
        super(new DefaultSoundBehaviour(), new DefaultFlyBehaviour());
        if (houseMate != null) {
            setSoundBehaviour(houseMate.getSoundBehaviour());
        }
    }

}
