public class LogLevels {

    public static String message(String logLine) {
        String[] line = logLine.split(" ");
        String message = "";
        for (int i = 1; i < line.length; i++) {
            message += line[i] + " ";
        }
        return message.trim();
    }

    public static String logLevel(String logLine) {
        String[] line = logLine.split(" ");
        String level = line[0].replace("[", "");
        level = level.replace("]", "");
        level = level.replace(":", "");
        return level.toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
