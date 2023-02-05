package org.example.logger.file_logger;

import org.example.logger.LoggerConfiguration;
import org.example.logger.LoggingLevel;

import java.io.File;
import java.text.MessageFormat;

public class FileLoggerConfiguration extends LoggerConfiguration {

    private File file;
    private long maxCapacity;

    private MessageFormat fileNameFormat = new MessageFormat("Log_{0}.txt");

    public FileLoggerConfiguration(LoggingLevel level, MessageFormat format, File file, long maxCapacity) {
        super(level, format);
        this.file = file;
        this.maxCapacity = maxCapacity;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public long getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(byte maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public MessageFormat getFileNameFormat() {
        return fileNameFormat;
    }

    public void setFileNameFormat(MessageFormat fileNameFormat) {
        this.fileNameFormat = fileNameFormat;
    }
}
