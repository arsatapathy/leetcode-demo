package com.arsatapathy.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTest {

    @Test
    public void test_01() {

        Assertions.assertArrayEquals(new int[]{0,1}, TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9));
        Assertions.assertArrayEquals(new int[]{3,4}, TwoSum.twoSum(new int[] {1, 2, 7, 3, 4, 15}, 7));

    }
}
