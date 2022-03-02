package com.arsatapathy.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MinimumOperationTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(4, MinimumOperation.minOperation(5));
        // 5 - 1 = 4, 4 / 2 = 2, 2/ 2 = 1, 1 - 1 = 0
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(3, MinimumOperation.minOperation(4));
        // 4 / 2 = 2 , 2 / 2 = 1, 1 - 1 = 0
    }

    @Test
    public void test_03() {
        Assertions.assertEquals(4, MinimumOperation.minOperation(8));
    }

    @Test
    public void test_04() {
        Assertions.assertEquals(5, MinimumOperation.minOperation(7));
    }
}
