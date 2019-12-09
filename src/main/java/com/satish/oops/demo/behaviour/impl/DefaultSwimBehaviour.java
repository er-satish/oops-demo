package com.satish.oops.demo.behaviour.impl;

import com.satish.oops.demo.behaviour.FlyBehaviour;
import com.satish.oops.demo.behaviour.SwimBehaviour;

/**
 * Impl. the default swim behaviour for an animal
 *
 * @see com.satish.oops.demo.beans.Animal
 * @see FlyBehaviour
 */
public class DefaultSwimBehaviour implements SwimBehaviour {
    /**
     * {@inheritDoc}
     *
     * @return
     */
    @Override
    public String swim() {
        String msg = "i am swimming";
        System.out.println(msg);
        return msg;
    }
}
