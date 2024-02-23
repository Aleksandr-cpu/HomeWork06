package complexNumberCalculator.core.logger;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerCal {

    private static final Logger logger = Logger.getLogger(Logger.class.getName());

    public static void severe(String message) {
        logger.log(Level.SEVERE, message);
    }

    public static void info(String message) {
        logger.log(Level.INFO, message);
    }
}
