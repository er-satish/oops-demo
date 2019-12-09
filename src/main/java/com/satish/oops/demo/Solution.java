package com.satish.oops.demo;

import com.satish.oops.demo.beans.Bird;
import com.satish.oops.demo.behaviour.impl.DefaultFlyBehaviour;
import com.satish.oops.demo.behaviour.impl.DefaultSoundBehaviour;

/**
 * Offers main method to run the sample code
 */
public class Solution {
    public static void main(String[] args) {
        Bird bird =  new Bird(new DefaultSoundBehaviour(),new DefaultFlyBehaviour());
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
