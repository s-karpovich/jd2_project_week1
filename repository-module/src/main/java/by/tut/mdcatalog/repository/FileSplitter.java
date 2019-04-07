package by.tut.mdcatalog.repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileSplitter {
    public ArrayList<String> getRowsListFromFile(String fileName) throws IOException {
        ArrayList<String> rowsList = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        while (bufferedReader.ready()) {
            rowsList.add(bufferedReader.readLine());
        }
        return rowsList;
    }
}
