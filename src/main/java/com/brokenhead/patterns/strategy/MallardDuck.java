package com.brokenhead.patterns.strategy;

import com.brokenhead.patterns.strategy.behavior.FlyWithWings;
import com.brokenhead.patterns.strategy.behavior.QuackWithVoice;


/**
 * A concrete duck.
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new QuackWithVoice());
    }

    @Override
    public void display() {
        System.out.println("=> I am a mallard duck");
    }
}
