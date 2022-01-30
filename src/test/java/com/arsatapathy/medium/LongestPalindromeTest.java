package com.arsatapathy.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestPalindromeTest {

    @Test
    public void test_01() {
        Assertions.assertEquals("aba", LongestPalindrome.longestPalindrome("babad"));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals("bb", LongestPalindrome.longestPalindrome("cbbd"));
    }
}
