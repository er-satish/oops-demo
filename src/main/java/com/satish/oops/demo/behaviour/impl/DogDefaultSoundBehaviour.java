package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.SoundBehaviour;

/**
 * Impl. a default sound (Woof) for an dog
 *
 * @see com.satish.oops.demo.beans.Animal
 * @see SoundBehaviour
 */
public class DogDefaultSoundBehaviour implements SoundBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String sing() {
        String msg = "Woof, woof";
        System.out.println(msg);
        return msg;
    }
}
