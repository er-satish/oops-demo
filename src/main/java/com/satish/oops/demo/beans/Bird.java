package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.FlyBehaviour;
import com.satish.oops.demo.behaviour.SoundBehaviour;
import org.springframework.util.StringUtils;

/**
 * Defines a Bird based on Animal
 *
 * @see Animal
 */
public class Bird extends Animal {

    private FlyBehaviour flyBehaviour;

    public Bird(SoundBehaviour soundBehaviour, FlyBehaviour flyBehaviour) {
        super(soundBehaviour);
        this.flyBehaviour = flyBehaviour;
    }

    /**
     * impl. how a bird fly
     *
     * @return
     */
    public String fly() {
        if (flyBehaviour != null) {
            return flyBehaviour.fly();
        }
        return "";
    }

    /**
     * Dynamically overwirtes the fly behaviour
     *
     * @param flyBehaviour
     */
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }
}
