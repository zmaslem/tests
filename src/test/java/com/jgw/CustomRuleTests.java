package com.jgw;

import org.junit.Rule;
import org.junit.Test;

/**
 * Created by kdeveloper on 24.01.17.
 */
public class CustomRuleTests {

    @Rule
    public MyCustomRule myCustomRule = new MyCustomRule("custom");

    @Test
    public void myAwesomeMethodInvokedSuccessfully() {
        System.out.println("Test worked OK");
    }
}
