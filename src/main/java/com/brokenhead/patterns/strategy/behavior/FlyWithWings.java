package com.brokenhead.patterns.strategy.behavior;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("=> I can fly with a wings!");
    }
}
