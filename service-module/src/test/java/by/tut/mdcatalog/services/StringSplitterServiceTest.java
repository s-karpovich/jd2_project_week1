package by.tut.mdcatalog.services;

import by.tut.mdcatalog.services.exceptions.InvalidStringException;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringSplitterServiceTest
{

    @Test
    public void shouldCalculateSumOfOneNumberInString() {
        StringSplitterService stringSplitter = new StringSplitterService();
        assertEquals (1000, stringSplitter.add("1000"));
    }
    @Test
    public void shouldCalculateIfDelimiterIsComma() {
        StringSplitterService stringSplitter = new StringSplitterService();
        assertEquals(1200, stringSplitter.add("1000,200"));
    }
    @Test
    public void shouldCalculateIfDelimiterIsColon() {
        StringSplitterService stringSplitter = new StringSplitterService();
        assertEquals(1200, stringSplitter.add("1000:200"));
    }
    @Test
    public void shouldCalculateIfDelimiterIsPipe() {
        StringSplitterService stringSplitter = new StringSplitterService();
        assertEquals(1200, stringSplitter.add("1000|200"));
    }
    @Test
    public void shouldCalculateIfDelimiterIsNewLine() {
        StringSplitterService stringSplitter = new StringSplitterService();
        assertEquals(1200, stringSplitter.add("1000\n200"));
    }
    @Test(expected = InvalidStringException.class)
    public void shouldThrowInvalidStringExceptionIfDoesNotMatchPattern(){
        StringSplitterService stringSplitter = new StringSplitterService();
        stringSplitter.add("1,2,3");
    }
    @Test
    public void shouldReturnZeroIfStringIsEmpty() {
        StringSplitterService stringSplitter = new StringSplitterService();
        assertEquals(0, stringSplitter.add(""));
    }
    @Test(expected = InvalidStringException.class)
    public void shouldThrowInvalidStringExceptionIfNull(){
        StringSplitterService stringSplitter = new StringSplitterService();
        stringSplitter.add(null);
    }
}
