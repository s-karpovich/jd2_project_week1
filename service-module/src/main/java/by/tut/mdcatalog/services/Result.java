package by.tut.mdcatalog.services;

import by.tut.mdcatalog.repository.FileTextSplitter;
import by.tut.mdcatalog.services.exceptions.InvalidStringException;

import java.io.IOException;
import java.util.ArrayList;

public class Result {
    public String getFileNumbersSum(String fileName) throws IOException, InvalidStringException {
        int NumbersInFileSum = 0;
        FileTextSplitter fileSplitter = new FileTextSplitter();
        ArrayList<String> rowsList = fileSplitter.getRowsListFromFile(fileName);

        StringSplitter stringSplitter = new StringSplitter();
        for (String row : rowsList) {
            NumbersInFileSum = NumbersInFileSum + stringSplitter.add(row);
        }
        return String.valueOf(NumbersInFileSum);
    }
}
