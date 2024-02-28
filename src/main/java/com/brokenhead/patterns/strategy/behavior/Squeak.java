package com.brokenhead.patterns.strategy.behavior;

public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("=> I can't quack at all");
    }
}
