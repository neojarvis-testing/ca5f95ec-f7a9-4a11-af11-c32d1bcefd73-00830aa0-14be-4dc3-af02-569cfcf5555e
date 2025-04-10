package utils;
 
import org.apache.log4j.Logger;
 
public class LoggerHandler {
 
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);
 
    public static void traceMessage(String message) {
        logger.trace(message);
    }
 
    public static void debugMessage(String message) {
        logger.debug(message);
    }
 
    public static void infoMessage(String message) {
        logger.info(message);
    }
 
    public static void warnMessage(String message) {
        logger.warn(message);
    }
 
    public static void errorMessage(String message) {
        logger.error(message);
    }
 
    public static void fatalMessage(String message) {
        logger.fatal(message);
    }
 
}