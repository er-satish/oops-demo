package com.satish.oops.demo.beans;

/**
 * Defines a Bird based on Animal
 * @see Animal
 */
public class Bird extends Animal {
    public void fly() {
        System.out.println("I am flying");
    }

    /**
     * Sing the song
     * @return the song lyrics
     */
    public String sing() {
        String song = "I am singing";
        System.out.println(song);
        return song;
    }
}
