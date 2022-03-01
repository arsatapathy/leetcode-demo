package com.arsatapathy.hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestValidParenthesesTest {

    @Test
    public void test_01() {
       Assertions.assertEquals(2, LongestValidParentheses.longestValidParentheses("(()"));
    }

    @Test
    public void test_02() {
        Assertions.assertEquals(4, LongestValidParentheses.longestValidParentheses(")()())"));
    }

    @Test
    public void test_03() {
        Assertions.assertEquals(0, LongestValidParentheses.longestValidParentheses(""));
    }

    @Test
    public void test_04() {
        Assertions.assertEquals(8, LongestValidParentheses.longestValidParentheses("()))(()()())"));
    }

    @Test
    public void test_05() {
        Assertions.assertEquals(2, LongestValidParentheses.longestValidParentheses("()(()"));
    }

    @Test
    public void test_06() {
        Assertions.assertEquals(10, LongestValidParentheses.longestValidParentheses("()((((((())()()"));
    }


    @Test
    public void test_07() {
        Assertions.assertEquals(6, LongestValidParentheses.longestValidParentheses("()(())"));
    }
}
