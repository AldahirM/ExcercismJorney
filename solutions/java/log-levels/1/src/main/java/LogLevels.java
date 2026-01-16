public class LogLevels {

    public static void main(String[] args) {

        System.out.println(LogLevels.message("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.message("[WARNING]:  Disk almost full\r\n"));
        System.out.println(LogLevels.logLevel("[ERROR]: Invalid operation"));
        System.out.println(LogLevels.reformat("[INFO]: Operation completed"));
    }

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
