package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.impl.CluckSoundBehaviour;
import com.satish.oops.demo.behaviour.impl.NoFlyBehaviour;
import com.satish.oops.demo.behaviour.impl.RoosterDefaultSoundBehaviour;

/**
 * Defines a rooster based on Chicken.
 * Note: A rooster can be formed without inheriting from chicken as well, by just specifying
 * the individual behaviour of a rooster similar to how a Bird class is modeled.
 * @see Bird
 * @see Chicken
 */
public class Rooster extends Chicken {

    /**
     * Create a Duck
     */
    public Rooster() {
        //overwrites the default behaviour of a chicken to make it rooster
        super.setSoundBehaviour(new RoosterDefaultSoundBehaviour());
    }

}
