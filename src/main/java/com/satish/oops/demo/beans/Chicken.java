package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.SwimBehaviour;
import com.satish.oops.demo.behaviour.impl.CluckSoundBehaviour;
import com.satish.oops.demo.behaviour.impl.DefaultFlyBehaviour;
import com.satish.oops.demo.behaviour.impl.DefaultSwimBehaviour;
import com.satish.oops.demo.behaviour.impl.NoFlyBehaviour;
import com.satish.oops.demo.behaviour.impl.QuackSoundBehaviour;

/**
 * Defines a Chicken based on Bird
 *
 * @see Bird
 */
public class Chicken extends Bird {

    /**
     * Create a Duck
     */
    public Chicken() {
        super(new CluckSoundBehaviour(), new NoFlyBehaviour());
    }

}
