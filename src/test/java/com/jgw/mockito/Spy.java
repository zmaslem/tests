package com.jgw.mockito;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created by zmaslem on 21.03.17.
 */
public class Spy {
    private static final String STRING = "string";
    @Test
    public void testMock() {
        List<String> listMock = mock(ArrayList.class);
        listMock.add(new String(STRING));
        verify(listMock).add(STRING);
        assertEquals("should be 0", 0, listMock.size());
    }

    @Test
    public void testSpy() {
        List<String> listSpy = spy(ArrayList.class);
        listSpy.add(new String(STRING));
        verify(listSpy).add(STRING);
        assertEquals("should be 1", 1, listSpy.size());
    }

    @Test
    public void testSpy2() {
        List<String> listSpy = spy(ArrayList.class);
        when(listSpy.size()).thenReturn(5, 10);
        assertEquals("should be 5", 5, listSpy.size());
        assertEquals("should be 10", 10, listSpy.size());
        assertEquals("should be 10", 10, listSpy.size());
    }

    @Test
    public void testStub() {
        List<String> listStub = mock(ArrayList.class);
        when(listStub.size()).thenReturn(20);
        assertEquals("should be 20", 20, listStub.size());
    }
}
