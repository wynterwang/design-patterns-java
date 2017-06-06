package com.pattern.creational.abstractfactory;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for abstract factory
 */
public class AppTest extends TestCase {
    public AppTest(String testName) {
        super(testName);
    }

    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    public void testApp() {
        App.main(null);
    }
}