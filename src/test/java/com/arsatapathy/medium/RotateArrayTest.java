package com.arsatapathy.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RotateArrayTest {

    @Test
    public void test_01() {
        int[] array = new int[] {1,2,3,4,5,6,7};
        RotateArray.rotate(array, 3);
        Assertions.assertArrayEquals(new int[]{5,6,7,1,2,3,4}, array);
    }

    @Test
    public void test_02() {
        int[] array = new int[] {-1,-100,3,99};
        RotateArray.rotate(array, 2);
        Assertions.assertArrayEquals(new int[]{3,99,-1,-100}, array);
    }

}
