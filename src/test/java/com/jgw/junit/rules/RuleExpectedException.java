package com.jgw.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.containsString;

/**
 * Created by zmaslem on 15.03.17.
 */
public class RuleExpectedException {

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Test
    public void test() {
        exception.expect(ArithmeticException.class);
        exception.expectMessage(containsString("/ by zero"));
        int i = 1 / 0;
    }
}
