package com.brokenhead.algorithms;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class InterviewTasks {

    public int countFactorial(int number) {
        if (number == 0) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public char mostFrequentSymbol(String phrase) {
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < phrase.length(); i++) {
            char symbol = Character.toLowerCase(phrase.charAt(i));
            if (map.containsKey(symbol)) {
                int count = map.get(symbol);
                map.put(symbol, ++count);
            } else {
                map.put(symbol, 1);
            }
        }
        return map.entrySet().stream()
                .max(Comparator.comparing(Map.Entry::getValue))
                .orElseThrow()
                .getKey();
    }
}
