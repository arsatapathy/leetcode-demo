package com.arsatapathy.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTest {

    @Test
    public void test_01() {
        Assertions.assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    public void test_02() {
        Assertions.assertFalse(ValidParentheses.isValid("(]"));
    }

    @Test
    public void test_03() {
        Assertions.assertFalse(ValidParentheses.isValid("("));
    }

    @Test
    public void test_04() {
        Assertions.assertTrue(ValidParentheses.isValid("()"));
    }

    @Test
    public void test_05() {
        Assertions.assertFalse(ValidParentheses.isValid("()]"));
    }

    @Test
    public void test_06() {
        Assertions.assertFalse(ValidParentheses.isValid("({{{{}}}))"));
    }

    @Test
    public void test_07() {
        Assertions.assertFalse(ValidParentheses.isValid("(("));
    }
}
