package by.tut.mdcatalog.web;

import by.tut.mdcatalog.services.exceptions.InvalidStringException;
import by.tut.mdcatalog.services.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        final Logger logger = LogManager.getLogger(App.class);
        Result result = new Result();

        try {
            logger.info(result.getFileNumbersSum("" +
                    "web-module/src/main/resources/e.txt"));
        } catch (IOException | InvalidStringException e) {
            logger.error(e.getMessage(),e);
            throw e;
        }
    }
}
