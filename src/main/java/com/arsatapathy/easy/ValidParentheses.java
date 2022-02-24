package com.arsatapathy.easy;

import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        char[] array = s.toCharArray();

        Stack<Character> stack = new Stack<>();

        Set<Character> open = Set.of('(', '{', '[');
        Map<Character, Character> combination = Map.of(
                '(', ')',
                '{', '}',
                '[', ']'
        );

        for (char c : array) {
            if(open.contains(c)) {
                stack.push(c);
            } else{
                if (stack.isEmpty() || c != combination.get(stack.pop())) {
                    return false;
                }
            }
        }

       return stack.isEmpty();
    }
}
