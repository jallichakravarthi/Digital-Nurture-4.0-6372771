import java.time.LocalDateTime;

public class Logger {
    private static volatile Logger instance;
    private String data;

    private Logger(String data) {
        this.data = data;
    }

    public static Logger getInstanceLogger(String data) {
        Logger result = instance;
        if (result == null) {
            synchronized (Logger.class) {
                if (result == null) {
                    result = instance = new Logger(data);
                }
            }
        }
        return result;
    }

    public void logData() {
        if (data == null || data.isEmpty()) {
            System.out.println("No data to log.");
        } else {
            System.out.println("[" + LocalDateTime.now() + "] Logging data: " + data);
        }
    }

    public void log(String level, String message) {
        System.out.println("[" + LocalDateTime.now() + "][" + level + "] " + message);
    }
}