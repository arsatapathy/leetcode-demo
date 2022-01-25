package com.arsatapathy.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {

    @Test
    public void test_01() {
        Assertions.assertTrue(Palindrome.isPalindrome(121));
        Assertions.assertFalse(Palindrome.isPalindrome(123));
        Assertions.assertFalse(Palindrome.isPalindrome(1000021));
        Assertions.assertTrue(Palindrome.isPalindrome(11));
    }
}
