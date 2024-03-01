package com.brokenhead.patterns.adapter;

/**
 * Adapter implementation.
 * In this case we are adapting it in this way: drone -> adapter -> bird,
 * so, we can use drone as a bird.
 * This could be done in reverse way using BirdAdapter to use Bird as Drone.
 * Composition is used here as well - implement interface to which we want to adapt and
 * has Drone variable encapsulated.
 */
public class DroneAdapter implements Bird {

    private Drone adapteeDrone;

    public DroneAdapter(Drone droneToAdapt) {
        this.adapteeDrone = droneToAdapt;
    }

    @Override
    public void fly() {
        adapteeDrone.spinRotors();
        adapteeDrone.takeOff();
    }

    @Override
    public void sing() {
        adapteeDrone.beep();
    }
}
