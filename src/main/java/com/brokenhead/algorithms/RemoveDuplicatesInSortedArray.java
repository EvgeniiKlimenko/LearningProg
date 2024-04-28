package com.brokenhead.algorithms;

public class RemoveDuplicatesInSortedArray {
    /*
        Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place
        such that each unique element appears only once. The relative order of the elements should
        be kept the same. Then return the number of unique elements in nums.
        [0,0,1,1,1,2,2,3,3,4]
     */

    public int removeDuplicates(int[] nums) {
        int k = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
