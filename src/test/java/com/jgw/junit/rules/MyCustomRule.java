package com.jgw.junit.rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

/**
 * Created by kdeveloper on 24.01.17.
 */
public class MyCustomRule implements TestRule {
    private String label;

    public MyCustomRule(String label) {
        this.label = label;
    }

    @Override
    public Statement apply(final Statement statement, final Description description) {
        return new Statement() {
            @Override
            public void evaluate() throws Throwable {
                before();
                statement.evaluate();
                after();
            }
        };
    }

    private void before() {
        System.out.println(label + " before");
    }

    private void after() {
        System.out.println(label + " after");
    }
}
