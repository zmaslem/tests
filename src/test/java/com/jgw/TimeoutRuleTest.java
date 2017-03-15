package com.jgw;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import java.util.concurrent.TimeUnit;

/**
 * Created by zmaslem on 15.03.17.
 */
public class TimeoutRuleTest {

    //after
    @Rule
    public Timeout timeout = new Timeout(1, TimeUnit.SECONDS);

    //before
    @Test(timeout=1000)
    public void testA() throws Exception {

    }
}
