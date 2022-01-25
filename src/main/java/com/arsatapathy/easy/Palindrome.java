package com.arsatapathy.easy;

public class Palindrome {

    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        boolean isPalindrome = true;

        int i = 0;
        int j = input.length() - 1;

        while(i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i ++; j --;
        }

        return isPalindrome;
    }

}
