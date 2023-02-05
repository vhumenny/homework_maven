package logger;

import logger.LoggerConfiguration;

import java.net.URI;

public abstract class LoggerConfigurationLoader {

    public abstract LoggerConfiguration load(URI path);
}
