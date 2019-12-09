package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.SoundBehaviour;

/**
 * Impl. a Cluck sound for an animal
 *
 * @see com.satish.oops.demo.beans.Animal
 * @see SoundBehaviour
 */
public class CluckSoundBehaviour implements SoundBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String sing() {
        String msg = "Cluck, cluck";
        System.out.println(msg);
        return msg;
    }
}
