package com.jgw.junit.expected;

import org.junit.Test;

/**
 * Created by zmaslem on 15.03.17.
 */
public class ExpectExceptionTest {

    @Test(expected = ArithmeticException.class)
    public void test() {
        int i = 1 / 0;
    }
}
