package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.SoundBehaviour;

/**
 * Impl. a default sound behaviour for an cat
 *
 * @see com.satish.oops.demo.beans.Animal
 * @see SoundBehaviour
 */
public class CatDefaultSoundBehaviour implements SoundBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String sing() {
        String msg = "Meow";
        System.out.println(msg);
        return msg;
    }
}
