package com.brokenhead.algorithms;

public class MergeTwoSortedArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }

        int endIndex = nums1.length - 1;
        while (m > 0 && n > 0) {
            if (nums1[m - 1] <= nums2[n - 1]) {
                nums1[endIndex] = nums2[n - 1];
                n--;
            } else {
                nums1[endIndex] = nums1[m - 1];
                m--;
            }
            endIndex--;
        }

        // in case there are some numbers in nums2 left, according to n index
        while (n > 0) {
            nums1[endIndex] = nums2[n - 1];
            n--;
            endIndex--;
        }
    }
}
