package com.arsatapathy.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseIntegerTest {

    @Test
    public void test_01() {

        Assertions.assertEquals(321, ReverseInteger.reverse(123));
        Assertions.assertEquals(-321, ReverseInteger.reverse(-123));
        Assertions.assertEquals(21, ReverseInteger.reverse(120));
        Assertions.assertEquals(0, ReverseInteger.reverse(1534236469));
        Assertions.assertEquals(-2143847412, ReverseInteger.reverse(-2147483412));

    }
}
