package com.jgw.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;

/**
 * Created by kdeveloper on 24.01.17.
 */
public class RuleChainTests {
    @Rule
    public RuleChain chain = RuleChain.outerRule(new MyCustomRule("Outer")).around(new MyCustomRule("inner"));

    @Test
    public void ruleChainWorkedOK(){
        System.out.println("Test worked OK");
    }
}
