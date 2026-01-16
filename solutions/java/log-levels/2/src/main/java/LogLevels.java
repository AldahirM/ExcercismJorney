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
        String[] messages = {
                "ERROR",
                "WARNING",
                "INFO",
        };
        int index = 0;
        for (String string : messages) {
            if(logLine.contains(string)){
                break;
            };
            index++;
        }
        return messages[index].toLowerCase();
    }

    public static String reformat(String logLine) {
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}
