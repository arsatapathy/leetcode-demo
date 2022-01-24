package com.arsatapathy.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MedianOfTwoSortedArrayTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(4.0, MedianOfTwoSortedArray.findMedian(new int[] {1, 3, 5, 7}, new int[] {2, 4, 6}));
        Assertions.assertEquals(4.0, MedianOfTwoSortedArray.findMedian(new int[] {2, 4, 6}, new int[] {1, 3, 5, 7}));
        Assertions.assertEquals(3.5, MedianOfTwoSortedArray.findMedian(new int[] {1, 3, 5}, new int[] {2, 4, 6}));
    }
}
