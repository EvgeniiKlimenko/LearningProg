package com.brokenhead;

import com.brokenhead.patterns.strategy.Duck;
import com.brokenhead.patterns.strategy.MallardDuck;
import com.brokenhead.patterns.strategy.RubberDuck;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        // strategy pattern example:
        Duck mallardDuck = new MallardDuck();
        Duck rubber = new RubberDuck();
        mallardDuck.display();
        mallardDuck.performQuacking();
        mallardDuck.swim();
        rubber.display();
        rubber.performQuacking();
        rubber.swim();




    }
}