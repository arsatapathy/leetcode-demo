package com.arsatapathy.medium;

import java.util.HashMap;
import java.util.Map;

public class LongestPalindrome {

    public static String longestPalindrome(String s) {
        Map<String, Integer> memo = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            StringBuilder sb = new StringBuilder();

            for (int j = i; j < s.length(); j++) {
                sb.append(s.charAt(j));

                if (memo.containsKey(sb.toString())) continue;

                if (isPalindrome(sb.toString())) {
                    memo.put(sb.toString(), sb.toString().length());
                }
            }
        }

        String longestString = "";
        int length = 0;

        for (String key:
             memo.keySet()) {
            if (length < memo.get(key)) {
                length = memo.get(key);
                longestString = key;
            }
        }

        return longestString;
    }

    public static boolean isPalindrome(String s) {

        if (s.length() <= 1) return true;

        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        } else {
            return false;
        }
    }
}
