package com.arsatapathy.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class DetectCapital {

    public static boolean detectCapitalUsage(String word) {
        char[] chars = word.toCharArray();

        List<Integer> index = new LinkedList<>();

        Set<Character> caps = Set.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');


        for (int i = 0; i < chars.length; i++) {
            if (caps.contains(chars[i])) {
                index.add(i);
            }
        }

        return (chars.length == index.size()) || (index.size() == 0) || ((index.size() == 1) && (index.get(0) == 0));
    }
}
