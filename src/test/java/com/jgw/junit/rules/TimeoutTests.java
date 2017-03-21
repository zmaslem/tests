package com.jgw.junit.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

/**
 * Created by kdeveloper on 24.01.17.
 */
public class TimeoutTests {
    @Rule
    public Timeout globalTimeout =org.junit.rules.Timeout.seconds(5);

    @Test
    public void whatWeDoInATestMethodEchoesInEternity(){
        while(true);
    }
}
