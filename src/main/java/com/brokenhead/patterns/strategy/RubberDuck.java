package com.brokenhead.patterns.strategy;

import com.brokenhead.patterns.strategy.behavior.FlyNoWay;
import com.brokenhead.patterns.strategy.behavior.Squeak;

public class RubberDuck extends Duck {

    public RubberDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Squeak());
    }

    @Override
    public void display() {
        System.out.println("=> I am a yellow rubber duck!");
    }
}
