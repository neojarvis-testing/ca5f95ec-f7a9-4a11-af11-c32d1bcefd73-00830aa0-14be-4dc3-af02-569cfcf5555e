package utils;
 
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.DailyRollingFileAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.Level;
 
public class LoggerHandler {
 
    private static final Logger logger = Logger.getLogger(LoggerHandler.class);

    static {
                try {
                    String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
                    String logFileName = "logs/app_" + timestamp + ".log";
                    PatternLayout layout = new PatternLayout("[%p] %d %c %M - %m%n");
 
                    DailyRollingFileAppender rollingAppender = new DailyRollingFileAppender();
                    rollingAppender.setFile(logFileName);
                    rollingAppender.setDatePattern("'.'yyyy-MM-dd");
                    rollingAppender.setLayout(layout);
                    rollingAppender.activateOptions();
 
                    Logger rootLogger = Logger.getRootLogger();
                    rootLogger.setLevel(Level.DEBUG);
                    rootLogger.addAppender(rollingAppender);
                } catch (Exception e) {
                    System.err.println("Failed to initialize logger: " + e.getMessage());
                }
            }
 
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