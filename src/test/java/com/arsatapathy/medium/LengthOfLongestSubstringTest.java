package com.arsatapathy.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LengthOfLongestSubstringTest {

    @Test
    public void test_01() {
        Assertions.assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("pwwkew"));
        Assertions.assertEquals(0, LengthOfLongestSubstring.lengthOfLongestSubstring(""));
        Assertions.assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring("a"));
        Assertions.assertEquals(1, LengthOfLongestSubstring.lengthOfLongestSubstring(" "));
        Assertions.assertEquals(3, LengthOfLongestSubstring.lengthOfLongestSubstring("dvdf"));
    }
}
