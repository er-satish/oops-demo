package com.satish.oops.demo;

import com.satish.oops.demo.beans.Bird;

/**
 * Offers main method to run the sample code
 */
public class Solution {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
