package com.arsatapathy.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MountainArrayTest {

    @Test
    public void test_01() {
        Assertions.assertTrue(MountainArray.validMountainArray(new int[] {0,3,2,1}));
        Assertions.assertTrue(MountainArray.validMountainArray(new int[] {0, 1, 2, 4, 2, 1}));
        Assertions.assertFalse(MountainArray.validMountainArray(new int[] {2, 0, 2}));
        Assertions.assertFalse(MountainArray.validMountainArray(new int[] {0, 1, 2, 1, 2}));
        Assertions.assertFalse(MountainArray.validMountainArray(new int[] {0,1,2,3,4,5,6,7,8,9}));
    }
}
