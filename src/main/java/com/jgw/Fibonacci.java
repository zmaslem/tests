package com.jgw;

/**
 * Created by kdeveloper on 03.02.17.
 */
public class Fibonacci {
    public int fib(final int value) {
        if (value < 2) {
            return value;
        } else {
            return fib(value- 1) + fib(value - 2);
        }
    }
}
