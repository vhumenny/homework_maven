package logger;

import logger.LoggerConfiguration;

public abstract class LoggerConfigurationLoader {

    public abstract LoggerConfiguration load(String path);
}
