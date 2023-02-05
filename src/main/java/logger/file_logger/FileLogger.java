package logger.file_logger;

import logger.Logger;
import logger.LoggingLevel;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger extends Logger {
    FileLoggerConfiguration fileLoggerConfiguration;

    public FileLogger(FileLoggerConfiguration fileLoggerConfiguration) {
        this.fileLoggerConfiguration = fileLoggerConfiguration;
    }

    @Override
    public void debug(String message) {
        if (!fileLoggerConfiguration.getLevel().equals(LoggingLevel.INFO)) {
            checkFileSize();
            writeLog(message);
        }
    }

    @Override
    public void info(String message) {
        checkFileSize();
        writeLog(message);
    }

    private void checkFileSize() {
        if (fileLoggerConfiguration.getFile().length() >= fileLoggerConfiguration.getMaxCapacity()) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
            Object[] args = {sdf.format(new Date())};

            String fileName = fileLoggerConfiguration.getFileNameFormat().format(args);
            fileLoggerConfiguration.setFile(new File(fileName));
        }
    }

    private void writeLog(String message) {
        Object[] args = {new Date(), fileLoggerConfiguration.getLevel(), message};
        String stringToWrite = fileLoggerConfiguration.getFormat().format(args);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileLoggerConfiguration.getFile(),
                true))) {
            writer.write(stringToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
