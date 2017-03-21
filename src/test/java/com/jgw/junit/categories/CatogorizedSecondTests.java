package com.jgw.junit.categories;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * Created by kdeveloper on 03.02.17.
 */
public class CatogorizedSecondTests {
    @Test
    @Category(SlowTests.class)
    public void thisTestRunsSlowly() {
        System.out.println("Second slow test running");
    }

    @Test
    @Category(FastTests.class)
    public void thisTestRunsFast() {
        System.out.println("Second fast test running");
    }
}
