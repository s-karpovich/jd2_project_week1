package by.tut.mdcatalog.services;

import by.tut.mdcatalog.services.exceptions.InvalidStringException;
import by.tut.mdcatalog.services.StringSplitter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringSplitterTest
{
    @Test
    public void shouldReturnZeroIfStringIsEmpty() {
        StringSplitter stringSplitter = new StringSplitter();
        assertEquals(stringSplitter.add(""),0);
    }
    @Test
    public void shouldCalculateSumOfOneNumberInString() {
        StringSplitter stringSplitter = new StringSplitter();
        assertEquals(stringSplitter.add("1000"),1000);
    }
    @Test
    public void shouldCalculateSumOfTwoNumbersInString() {
    StringSplitter stringSplitter = new StringSplitter();
    assertEquals(stringSplitter.add("1000,200"),1200);
    assertEquals(stringSplitter.add("1000:200"),1200);
    assertEquals(stringSplitter.add("1000|200"),1200);
    assertEquals(stringSplitter.add("1000\n200"),1200);
}
    @Test(expected = InvalidStringException.class)
    public void shouldThrowInvalidStringExceptionIfDoesNotMatchPattern(){
        StringSplitter stringSplitter = new StringSplitter();
        stringSplitter.add("1,2,3");
    }

    @Test(expected = InvalidStringException.class)
    public void shouldThrowInvalidStringExceptionIfNull(){
        StringSplitter stringSplitter = new StringSplitter();
        stringSplitter.add(null);
    }
}
