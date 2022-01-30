package com.arsatapathy.medium;

public class RotateArray {

    public static void rotate(int[] nums, int k) {

        if (nums.length <= 1) return;
        k = k % nums.length;

        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length -1);
        reverse(nums, 0, nums.length -1);
    }

    public static void reverse(int[] array, int i, int j) {

        int left = i;
        int right = j;

        while(left < right) {
            int temp = array[left];

            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }

    }


}
