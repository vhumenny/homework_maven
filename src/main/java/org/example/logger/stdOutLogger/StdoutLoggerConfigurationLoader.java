package org.example.logger.stdOutLogger;

import org.example.logger.LoggerConfigurationLoader;
import org.example.logger.LoggingLevel;

import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.Properties;

public class StdoutLoggerConfigurationLoader extends LoggerConfigurationLoader {

    @Override
    public StdoutLoggerConfiguration load(String path) {
        Properties property = new Properties();

        try (FileReader fileReader = new FileReader(path)) {
            property.load(fileReader);
            return new StdoutLoggerConfiguration(
            LoggingLevel.valueOf(property.getProperty("LEVEL")),
            new MessageFormat(property.getProperty("FORMAT")));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
