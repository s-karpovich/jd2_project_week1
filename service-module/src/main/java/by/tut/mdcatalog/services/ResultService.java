package by.tut.mdcatalog.services;

import by.tut.mdcatalog.repository.FileTextSplitterRepository;
import by.tut.mdcatalog.services.exceptions.InvalidStringException;

import java.io.IOException;
import java.util.ArrayList;

public class ResultService {
    public String getFileNumbersSum(String fileName) throws IOException, InvalidStringException {
        int NumbersInFileSum = 0;
        FileTextSplitterRepository fileSplitter = new FileTextSplitterRepository();
        ArrayList<String> rowsList = fileSplitter.getRowsListFromFile(fileName);

        StringSplitterService stringSplitter = new StringSplitterService();
        for (String row : rowsList) {
            NumbersInFileSum = NumbersInFileSum + stringSplitter.add(row);
        }
        return String.valueOf(NumbersInFileSum);
    }
}
