package logger;

import logger.LoggerConfiguration;

import java.io.InputStream;
import java.net.URI;
import java.util.stream.Stream;

public abstract class LoggerConfigurationLoader {

    public abstract LoggerConfiguration load(InputStream stream);
}
