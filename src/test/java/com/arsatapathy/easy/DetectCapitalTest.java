package com.arsatapathy.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DetectCapitalTest {

    @Test
    public void test_01() {
        Assertions.assertTrue(DetectCapital.detectCapitalUsage("USA"));
        Assertions.assertTrue(DetectCapital.detectCapitalUsage("Google"));
        Assertions.assertFalse(DetectCapital.detectCapitalUsage("FlaG"));
        Assertions.assertTrue(DetectCapital.detectCapitalUsage("leetcode"));
    }
}
