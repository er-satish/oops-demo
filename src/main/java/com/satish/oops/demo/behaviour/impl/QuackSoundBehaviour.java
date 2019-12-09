package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.SoundBehaviour;

/**
 * Impl. a Quack sound behaviour for an animal
 *
 * @see com.satish.oops.demo.beans.Animal
 * @see SoundBehaviour
 */
public class QuackSoundBehaviour implements SoundBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String sing() {
        String msg = "Quack, quack";
        System.out.println(msg);
        return msg;
    }
}
