package logger.stdOutLogger;

import logger.LoggerConfigurationLoader;
import logger.LoggingLevel;

import java.io.*;
import java.net.URI;
import java.text.MessageFormat;
import java.util.Properties;

public class StdoutLoggerConfigurationLoader extends LoggerConfigurationLoader {

    @Override
    public StdoutLoggerConfiguration load(InputStream stream) {
        try (Reader fileReader = new InputStreamReader(stream)) {
            Properties property = new Properties();
            property.load(fileReader);
            return new StdoutLoggerConfiguration(
            LoggingLevel.valueOf(property.getProperty("LEVEL")),
            new MessageFormat(property.getProperty("FORMAT")));
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
