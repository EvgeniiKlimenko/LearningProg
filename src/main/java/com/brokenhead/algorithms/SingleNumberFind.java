package com.brokenhead.algorithms;

import java.util.*;

public class SingleNumberFind {

    public static int singleNumber(int[] nums) {
        Map<Integer, Integer> myMap = new HashMap<>();

        for(int number: nums) {
            if(!myMap.containsKey(number)) {
                myMap.put(number, 1);
            } else {
                myMap.remove(number);
            }
        }

        return myMap.keySet().iterator().next();
    }
}
