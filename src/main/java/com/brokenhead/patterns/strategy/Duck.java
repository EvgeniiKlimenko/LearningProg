package com.brokenhead.patterns.strategy;

import com.brokenhead.patterns.strategy.behavior.FlyBehavior;
import com.brokenhead.patterns.strategy.behavior.QuackBehavior;


/**
 * abstract superclass for all ducks in the system.
 * Composition is used to change behavior - ...Behavior variables.
 * Interface will stay the same and duck doesn't know anything about
 * exact implementation of behavior classes.
 */
public abstract class Duck {

    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    protected void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    protected void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuacking() {
        quackBehavior.quack();
    }

    public void performFlying() {
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("=> I am swimming!");
    }

    public abstract void display();
}
