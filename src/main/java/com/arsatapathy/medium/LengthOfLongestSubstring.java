package com.arsatapathy.medium;

import java.util.*;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        int length = 0;

        Map<String, Integer> memo = new HashMap<>();

        char[] letters = s.toCharArray();

        StringBuilder temp = new StringBuilder();


        for (char letter : letters) {
            if (!temp.toString().contains(String.valueOf(letter))) {
                temp.append(letter);
            } else {
                memo.put(temp.toString(), temp.length());
                int foundAt = temp.indexOf(String.valueOf(letter));
                temp = new StringBuilder(temp.substring(foundAt + 1) + letter);
            }
        }

        memo.put(temp.toString(), temp.length());

        for (int value :memo.values()) {
            if (value > length) {
                length = value;
            }
        }

        return length;
    }
}
