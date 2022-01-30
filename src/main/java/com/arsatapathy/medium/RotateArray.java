package com.arsatapathy.medium;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        for (int j = 0; j < k; j++) {
            int temp = nums[n - 1];

            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }

            nums[0] = temp;
        }
    }

}
