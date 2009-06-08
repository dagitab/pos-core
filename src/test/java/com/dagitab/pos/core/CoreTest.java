package com.dagitab.pos.core;

import junit.framework.TestCase;

public class CoreTest extends TestCase {
    public void testGetHello() throws Exception {
        assertEquals("Hello", Core.getHello());
    }
}