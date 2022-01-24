package com.arsatapathy.easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> memo = new HashMap<>();

        for (int i =0; i < nums.length; i++) {
            memo.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (memo.containsKey(complement) && memo.get(complement) != i) {
                return new int[] {i, memo.get(complement)};
            }

        }

        return null;
    }

}
