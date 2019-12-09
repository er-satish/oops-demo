package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.FlyBehaviour;
import com.satish.oops.demo.behaviour.SoundBehaviour;
import com.satish.oops.demo.behaviour.SwimBehaviour;
import com.satish.oops.demo.behaviour.impl.DefaultFlyBehaviour;
import com.satish.oops.demo.behaviour.impl.DefaultSwimBehaviour;
import com.satish.oops.demo.behaviour.impl.QuackSoundBehaviour;

/**
 * Defines a Duck based on Bird
 *
 * @see Bird
 */
public class Duck extends Bird {

    private SwimBehaviour swimBehaviour;

    /**
     * Create a Duck
     */
    public Duck() {
        super(new QuackSoundBehaviour(), new DefaultFlyBehaviour());
        this.swimBehaviour = new DefaultSwimBehaviour();
    }

    /**
     * defines how a duck swims
     * @see SwimBehaviour#swim()
     *
     * @return
     */
    public String swim() {
        if (swimBehaviour != null) {
            return swimBehaviour.swim();
        }
        return "";
    }

}
