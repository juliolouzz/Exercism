public class LogLevels {
    
    public static String message(String logLine) {
        int firstSpace = logLine.indexOf(" ");
        return logLine.substring(firstSpace + 1).trim();

    }

    public static String logLevel(String logLine) {
        int firstSquare = logLine.indexOf("[");
        int lastSquare = logLine.indexOf("]");
        return logLine.substring(firstSquare + 1, lastSquare).toLowerCase();
    }

    public static String reformat(String logLine) {
        return LogLevels.message(logLine) + " " + "(" + LogLevels.logLevel(logLine) + ")";
    }
}
