package com.jgw.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.core.Is.is;

/**
 * Created by kdeveloper on 23.01.17.
 */
public class ErrorCollectorTests {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void statementsCollectedSuccessfully(){
        String s = null;
        collector.checkThat("Value should not be null", null, is(s));
        s = "";
        collector.checkThat("Value should have the length of 1", s.length(), is(1));
        s = "JUnit!";
        collector.checkThat("Value should have the length of 10", s.length(), is(10));
    }


}
