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

    private SoundBehaviour soundBehaviour;
    private FlyBehaviour flyBehaviour;

    public Bird(SoundBehaviour soundBehaviour, FlyBehaviour flyBehaviour) {
        this.soundBehaviour = soundBehaviour;
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
     * Sing the song
     *
     * @return the song lyrics
     */
    public String sing() {
        if (soundBehaviour != null) {
            return soundBehaviour.sing();
        }
        //return empty string
        return "";
    }
}
