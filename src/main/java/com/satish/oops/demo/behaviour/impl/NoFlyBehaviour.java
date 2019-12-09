package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.FlyBehaviour;

/**
 * Impl. a behaviour to fly for an animal
 *
 * @see com.satish.oops.demo.beans.Animal
 * @see com.satish.oops.demo.behaviour.FlyBehaviour
 */
public class NoFlyBehaviour implements FlyBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String fly() {
        String msg = "i cannot fly";
        System.out.println(msg);
        return msg;
    }
}
