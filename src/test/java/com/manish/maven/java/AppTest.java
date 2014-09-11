package com.manish.maven.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testStringReverse()
    {
        App app = new App();
        assertEquals("String Reverse Failed  ", "", app.StringReverse("") );
        assertEquals("String Reverse Failed  ", "H", app.StringReverse("H") );
        assertEquals("String Reverse Failed  ", "olleH", app.StringReverse("Hello") );
    }

    public void testSentenceReverse(){

        App app = new App();
        assertEquals("String Reverse Failed  ", "", app.SentenceReverse("") );
        assertEquals("String Reverse Failed  ", "R", app.SentenceReverse("R") );
        assertEquals("String Reverse Failed  ", "yadoTsiyadnoM", app.SentenceReverse("Today is Monday") );

    }
}
