package com.jgw.junit.parametrized;

import com.jgw.Fibonacci;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by kdeveloper on 24.01.17.
 */
@RunWith(Parameterized.class)
public class ParametrizedTests {
    @Parameterized.Parameters
    public static List data() {
        return Arrays.asList(new Object[][]{
                {0, 0}, {1, 1}, {2,1},
                {3,2}, {4,3}, {5,5},
                {6,8}});
    }

    private int value;
    private int expected;
    private Fibonacci cut;

    public ParametrizedTests(int value, int expected) {
        this.cut = new Fibonacci();
        this.value = value;
        this.expected = expected;
    }

    @Test
    public void fibonacciNumberCalc() {
        assertEquals("msg", expected, cut.fib(value));
    }

}
