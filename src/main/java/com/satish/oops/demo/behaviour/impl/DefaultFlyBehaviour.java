package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.FlyBehaviour;

/**
 * Impl. the default fly behaviour for an animal
 *
 * @see com.satish.oops.demo.beans.Animal
 * @see FlyBehaviour
 */
public class DefaultFlyBehaviour implements FlyBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String fly() {
        String msg = "I am flying";
        System.out.println(msg);
        return msg;
    }
}
