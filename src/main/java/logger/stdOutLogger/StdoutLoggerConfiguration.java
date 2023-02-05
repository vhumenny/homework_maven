package logger.stdOutLogger;

import logger.LoggerConfiguration;
import logger.LoggingLevel;

import java.text.MessageFormat;

public class StdoutLoggerConfiguration extends LoggerConfiguration {

    public StdoutLoggerConfiguration(LoggingLevel level, MessageFormat format) {
        super(level, format);
    }
}
