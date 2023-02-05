package org.example.logger.stdOutLogger;

import org.example.logger.LoggerConfiguration;
import org.example.logger.LoggingLevel;

import java.text.MessageFormat;

public class StdoutLoggerConfiguration extends LoggerConfiguration {

    public StdoutLoggerConfiguration(LoggingLevel level, MessageFormat format) {
        super(level, format);
    }
}
