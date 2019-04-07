package by.tut.mdcatalog.web;

import by.tut.mdcatalog.services.exceptions.InvalidStringException;
import by.tut.mdcatalog.services.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        final Logger logger = LogManager.getLogger(App.class);
        Result result = new Result();

        try {
            logger.info(result.getFileNumbersSum("e:/e.txt"));
        } catch (IOException | InvalidStringException e) {
            logger.error(e.getMessage());
        }
    }
}
