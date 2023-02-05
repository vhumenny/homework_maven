package logger.stdOutLogger;

import logger.Logger;
import logger.LoggingLevel;

import java.util.Date;

public class StdoutLogger extends Logger {

    StdoutLoggerConfiguration stdoutLoggerConfiguration;

    public StdoutLogger(StdoutLoggerConfiguration stdoutLoggerConfiguration) {
        this.stdoutLoggerConfiguration = stdoutLoggerConfiguration;
    }

    @Override
    public void debug(String message) {
        if (!stdoutLoggerConfiguration.getLevel().equals(LoggingLevel.INFO)) {
            writeLog(message);
        }
    }

    @Override
    public void info(String message) {
        writeLog(message);
    }

    private void writeLog(String message) {
        Object[] args = {new Date(), stdoutLoggerConfiguration.getLevel(), message};
        System.out.println(stdoutLoggerConfiguration.getFormat().format(args));
    }
}
