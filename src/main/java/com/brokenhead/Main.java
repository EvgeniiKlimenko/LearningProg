package com.brokenhead;

import com.brokenhead.algorithms.PalindromeCheck;
import com.brokenhead.algorithms.SimpleSort;
import com.brokenhead.algorithms.SingleNumberFind;
import com.brokenhead.patterns.adapter.Bird;
import com.brokenhead.patterns.adapter.Drone;
import com.brokenhead.patterns.adapter.DroneAdapter;
import com.brokenhead.patterns.adapter.DroneTaxi;
import com.brokenhead.patterns.observer.MagazineReader;
import com.brokenhead.patterns.observer.Observer;
import com.brokenhead.patterns.observer.PublishingHouse;
import com.brokenhead.patterns.strategy.Duck;
import com.brokenhead.patterns.strategy.MallardDuck;
import com.brokenhead.patterns.strategy.RubberDuck;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

//        System.out.println("Strategy pattern example:\n");
//        Duck mallardDuck = new MallardDuck();
//        Duck rubber = new RubberDuck();
//        mallardDuck.display();
//        mallardDuck.performQuacking();
//        mallardDuck.swim();
//        rubber.display();
//        rubber.performQuacking();
//        rubber.swim();
//
//        System.out.println("Adapter pattern example:\n");
//        Drone testDrone = new DroneTaxi();
//        Bird adapter = new DroneAdapter(testDrone); // now we can use Bird interface for a drone and pass it as a Bird
//        adapter.fly();
//        adapter.sing();
//
//        System.out.println("Observer pattern example:\n");
//        PublishingHouse igromania = new PublishingHouse();
//        Observer readerOne = new MagazineReader();
//        readerOne.subscribeTo(igromania);
//        igromania.setImportantValue(150); // notifySubscribers() is triggered here

        System.out.println("Simple sorting:\n");
        int[] array = {55, 88, 33, 77, 11, 22, 99, 44, 555, 111};
        SimpleSort simpleSort = new SimpleSort();
        //simpleSort.bubbleSort(array);
        //simpleSort.selectSort(array);

        System.out.println("Palindrome check:");
        //boolean result = PalindromeCheck.isPalindromeByIndexes("A man, a plan, a canal: Panama");
        //boolean result = PalindromeCheck.isPalindromeByIndexes("race a car");
        //System.out.println("Palindrome check result: " + result);

        System.out.println("Single number check:");
        int[] nums = {4,1,2,1,2};
        int singleNumberResult = SingleNumberFind.singleNumber(nums);

    }
}