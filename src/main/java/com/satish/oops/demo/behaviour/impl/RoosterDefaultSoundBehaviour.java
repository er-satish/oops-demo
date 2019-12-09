package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.SoundBehaviour;

/**
 * Impl. a default sound behaviour for a rooster
 *
 * @see com.satish.oops.demo.beans.Rooster
 * @see SoundBehaviour
 */
public class RoosterDefaultSoundBehaviour implements SoundBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String sing() {
        String msg = "Cock-a-doodle-doo";
        System.out.println(msg);
        return msg;
    }
}
