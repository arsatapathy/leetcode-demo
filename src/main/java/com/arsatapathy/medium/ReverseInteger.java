package com.arsatapathy.medium;

public class ReverseInteger {
    public static int reverse(int x) {
        int reverse = 0;

        int temp = x;

        while (temp != 0) {

            int right_digit = temp % 10;

            temp = temp / 10;

            if (Integer.MAX_VALUE / 10 < reverse) return 0;
            if (Integer.MIN_VALUE / 10 > reverse) return 0;

            reverse = reverse * 10 + right_digit;

        }

        return reverse;
    }
}
