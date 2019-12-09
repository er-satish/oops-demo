package com.satish.oops.demo.beans;

import com.satish.oops.demo.behaviour.SoundBehaviour;

/**
 * Define a animal
 */
public class Animal {
    private SoundBehaviour soundBehaviour;

    public Animal(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    public void walk() {
        System.out.println("I am walking");
    }

    /**
     * Sing the song or let's make some noise..
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

    /**
     * Dynamically overwirtes the sound behaviour
     *
     * @param soundBehaviour
     */
    public void setSoundBehaviour(SoundBehaviour soundBehaviour) {
        this.soundBehaviour = soundBehaviour;
    }

    /**
     * Get the sound behaviour
     *
     * @return
     */
    public SoundBehaviour getSoundBehaviour() {
        return soundBehaviour;
    }
}
