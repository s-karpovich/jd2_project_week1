package by.tut.mdcatalog.services;

import by.tut.mdcatalog.services.exceptions.InvalidStringException;
import by.tut.mdcatalog.services.StringSplitter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringSplitterTest
{

    @Test
    public void shouldCalculateSumOfOneNumberInString() {
        StringSplitter stringSplitter = new StringSplitter();
        assertEquals (1000, stringSplitter.add("1000"));
    }
    @Test
    public void shouldCalculateIfDelimiterIsComma() {
        StringSplitter stringSplitter = new StringSplitter();
        assertEquals(1200, stringSplitter.add("1000,200"));
    }
    @Test
    public void shouldCalculateIfDelimiterIsColon() {
        StringSplitter stringSplitter = new StringSplitter();
        assertEquals(1200, stringSplitter.add("1000:200"));
    }
    @Test
    public void shouldCalculateIfDelimiterIsPipe() {
        StringSplitter stringSplitter = new StringSplitter();
        assertEquals(1200, stringSplitter.add("1000|200"));
    }
    @Test
    public void shouldCalculateIfDelimiterIsNewLine() {
        StringSplitter stringSplitter = new StringSplitter();
        assertEquals(1200, stringSplitter.add("1000\n200"));
    }
    @Test(expected = InvalidStringException.class)
    public void shouldThrowInvalidStringExceptionIfDoesNotMatchPattern(){
        StringSplitter stringSplitter = new StringSplitter();
        stringSplitter.add("1,2,3");
    }
    @Test
    public void shouldReturnZeroIfStringIsEmpty() {
        StringSplitter stringSplitter = new StringSplitter();
        assertEquals(0, stringSplitter.add(""));
    }
    @Test(expected = InvalidStringException.class)
    public void shouldThrowInvalidStringExceptionIfNull(){
        StringSplitter stringSplitter = new StringSplitter();
        stringSplitter.add(null);
    }
}
