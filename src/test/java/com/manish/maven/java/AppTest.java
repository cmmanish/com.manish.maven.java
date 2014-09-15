package com.manish.maven.java;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest
        extends TestCase {
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Rigourous Test :-)
     */

    public void testIsPalindrome(){
        App app = new App();
        assertEquals("Fact Failed  1", false, app.isPalindrome(""));
        assertEquals("Fact Failed  2", true, app.isPalindrome("aba"));
        assertEquals("Fact Failed  w", false, app.isPalindrome("aadba"));
    }


    public void testeplaceWordsInSetence() {

        App app = new App();
        assertEquals("Fact Failed  1", "", app.replaceWordsInSentence(""));
        assertEquals("Fact Failed  2", "s", app.replaceWordsInSentence("s"));
        assertEquals("Fact Failed  3", "yadot si yadnom ot", app.replaceWordsInSentence("today is monday to"));

    }

    public void testStringBufferReverse() {

        App app = new App();
        assertEquals("Fact Failed  1", "", app.StringBufferReverse(""));
        assertEquals("Fact Failed  2", "s", app.StringBufferReverse("s"));
        assertEquals("Fact Failed  3", "yadoT", app.StringBufferReverse("Today"));

    }

    public void testFactorial() {
        App app = new App();
        assertEquals("Fact Failed  1", 1, app.Factorial(1));
        assertEquals("Fact Failed  2", 24, app.Factorial(4));
        assertEquals("Fact Failed  3", 2, app.Factorial(2));

    }

    public void testFibonachi() {

        App app = new App();
        assertEquals("Fib Failed  1", 2, app.Fibonachi(4));
        assertEquals("Fib Failed  2", 1, app.Fibonachi(1));
        assertEquals("Fib Failed  3", 8, app.Fibonachi(7));
    }

    public void testStringReverse() {
        App app = new App();
        assertEquals("String Reverse Failed  1", "", app.StringReverse(""));
        assertEquals("String Reverse Failed  2", "H", app.StringReverse("H"));
        assertEquals("String Reverse Failed  3", "olleH", app.StringReverse("Hello"));
    }

    public void testSentenceReverse() {

        App app = new App();
        assertEquals("SentenceReverse 1Failed  ", "", app.SentenceReverse(""));
        assertEquals("SentenceReverse 2 Failed  ", "R", app.SentenceReverse("R"));
        assertEquals("SentenceReverse 3 Failed  ", "yadoTsiyadnoM", app.SentenceReverse("Today is Monday"));

    }

    public void testUniqCharacter() {
        App app = new App();
        assertEquals("UniqCharacter 1 Failed  ", "", app.UniqCharacter(""));
        assertEquals("UniqCharacter 2 Failed  ", "c", app.UniqCharacter("AABBcAADD"));
        assertEquals("UniqCharacter 3 Failed  ", "c", app.UniqCharacter("c"));

    }
}
