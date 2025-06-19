public class LoggerTest {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstanceLogger("Initialization message");
        logger1.logData();

        Logger logger2 = Logger.getInstanceLogger("This should be ignored");
        logger2.logData();

        System.out.println("Are both logger instances the same? " + (logger1 == logger2));

        logger1.log("INFO", "Application started successfully.");
        logger2.log("ERROR", "Null pointer exception occurred.");
        logger1.log("DEBUG", "Processing user input in loop.");
    }
}
