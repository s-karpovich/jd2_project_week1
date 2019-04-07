package by.tut.mdcatalog.services;

import by.tut.mdcatalog.services.exceptions.InvalidStringException;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringSplitter {

    public int add(String numbers) throws InvalidStringException {
        int NumbersInRowSum = 0;
        if (validate(numbers)) {
            Pattern NumbersPattern = Pattern.compile("[0-9]+");
            Matcher matcher = NumbersPattern.matcher(numbers);
            while (matcher.find()) {
                NumbersInRowSum = NumbersInRowSum + Integer.parseInt(matcher.group());
            }
        } else {
            throw new InvalidStringException("The string does not match pattern");
        }
        return NumbersInRowSum;
    }

    private boolean validate(String var) {
        return (var != null && (var.matches("^([0-9]+[,:|\\\n]*){1,2}$") || var.equals("")));
    }
}

