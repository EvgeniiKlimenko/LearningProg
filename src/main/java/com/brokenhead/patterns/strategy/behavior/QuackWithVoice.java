package com.brokenhead.patterns.strategy.behavior;

public class QuackWithVoice implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("=> I am quacking with real voice!");
    }
}
