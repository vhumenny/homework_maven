package logger.stdOutLogger;

import logger.LoggerConfigurationLoader;
import logger.LoggingLevel;

import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.text.MessageFormat;
import java.util.Properties;

public class StdoutLoggerConfigurationLoader extends LoggerConfigurationLoader {

    @Override
    public StdoutLoggerConfiguration load(URI path) {
        Properties property = new Properties();

        try (FileReader fileReader = new FileReader(path.getPath())) {
            property.load(fileReader);
            return new StdoutLoggerConfiguration(
            LoggingLevel.valueOf(property.getProperty("LEVEL")),
            new MessageFormat(property.getProperty("FORMAT")));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
