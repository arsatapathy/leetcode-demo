package com.arsatapathy.hard;

public class MedianOfTwoSortedArray {

    public static double findMedian(int[] nums1, int[] nums2) {
        double median = 0;

        int targetLength = nums1.length + nums2.length;

        int[] target = new int[targetLength];

        int i = 0;
        int j = 0;
        int k = 0;

        while( i < nums1.length && j < nums2.length ) {

            if (nums1[i] < nums2[j]) {
                target[k] = nums1[i];
                i++;
            }
            else {
                target[k] = nums2[j];
                j++;
            }

            k++;
        }

        if (i < nums1.length) {

            while (i < nums1.length) {
                target[k] = nums1[i];
                k++;
                i++;
            }

        } else {
            while (j < nums2.length) {
                target[k] = nums2[j];
                k++;
                j++;
            }
        }

        if (targetLength % 2 == 0) {
            median = (target[targetLength / 2] + target[(targetLength / 2) -1]) / 2.0;
        } else {
            median = target[targetLength / 2];
        }

        return median;
    }
}
