package logger.file_logger;

import logger.LoggerConfigurationLoader;
import logger.LoggingLevel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.text.MessageFormat;
import java.util.Properties;

public class FileLoggerConfigurationLoader extends LoggerConfigurationLoader {

    @Override
    public FileLoggerConfiguration load(URI path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path.getPath()))) {
            Properties property = new Properties();
            property.load(reader);
            return new FileLoggerConfiguration(LoggingLevel.valueOf(property.getProperty("LEVEL")),
                    new MessageFormat(property.getProperty("FORMAT")),
                    new File(property.getProperty("FILE")),
                    Long.parseLong(property.getProperty("MAX-SIZE")));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
