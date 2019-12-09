package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.SoundBehaviour;

/**
 * Impl. the default sound behaviour for an animal
 *
 * @see com.satish.oops.demo.beans.Animal
 * @see SoundBehaviour
 */
public class DefaultSoundBehaviour implements SoundBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String sing() {
        String msg = "I am singing";
        System.out.println(msg);
        return msg;
    }
}
