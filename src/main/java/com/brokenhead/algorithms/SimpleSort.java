package com.brokenhead.algorithms;

import java.util.Arrays;

public class SimpleSort {

    /**
     * Bigger element goes right(upper position)
     * Working with pairs of numbers.
     * Inner loop - from the first element to outer-1
     */
    public void bubbleSort(int[] array) {
        System.out.println("Bubble sort. Before: " + Arrays.toString(array));
        int outer, inner;
        for (outer = (array.length - 1); outer > 1; outer--) { // last iteration is outer=2
            for (inner = 0; inner < outer; inner++) {    // last iteration is inner=1 (pair 1 and 2)
                if (array[inner] > array[inner + 1]) {
                    int temp = array[inner];
                    array[inner] = array[inner + 1];
                    array[inner + 1] = temp;
                }
            }
        }
        System.out.println("Bubble sort. After: " + Arrays.toString(array));
    }
    
    public void selectSort(int[] array) {
        System.out.println("Select sort. Before: " + Arrays.toString(array));
        int outer, inner, min;
        for (outer = 0; outer < (array.length - 1); outer++) { // last iteration is last-1(pre-last element)
            min = outer;
            // inner loop to find min element position only
            for (inner = (outer + 1); inner < array.length; inner++) { // from outer+1 to the end, check all.
                if (array[inner] < array[min]) {
                    min = inner;
                }
            }
            // then, swap old min value with new min value
            int temp = array[outer];
            array[outer] = array[min];
            array[min] = temp;

        }
        System.out.println("Select sort. After: " + Arrays.toString(array));
    }

    public void insertSort(int[] array) {

    }
}
