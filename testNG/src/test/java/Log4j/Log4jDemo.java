package Log4j;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log4jDemo {
    private static Logger logger = Logger.getLogger(String.valueOf(Log4jDemo.class));
    public static void main(String[] args) {
        System.out.println("\n  Hello World...!  \n");
        logger.info("This is information message");
        logger.warning("This is a warning");
        logger.severe("This is an error");
        logger.fine("This is a fine");
        System.out.println("\n  completed");

    }
}
