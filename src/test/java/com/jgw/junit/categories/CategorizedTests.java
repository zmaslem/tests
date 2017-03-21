package com.jgw.junit.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by kdeveloper on 24.01.17.
 */
public class CategorizedTests {
    @Test
    @Category(SlowTests.class)
    public void thisTestRunsSlowly() {
        System.out.println("Slow test running");
    }

    @Test
    @Category(FastTests.class)
    public void thisTestRunsFast() {
        System.out.println("Fast test running");
    }
}
