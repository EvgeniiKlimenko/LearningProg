package com.brokenhead.patterns.adapter;

/**
 * Example class for demonstration purposes.
 */
public class DroneTaxi implements Drone {

    @Override
    public void beep() {
        System.out.println("=> Beep Beep!");
    }

    @Override
    public void spinRotors() {
        System.out.println("=> Rotors are spinning!");
    }

    @Override
    public void takeOff() {
        System.out.println("=> Taking off!");
    }
}
