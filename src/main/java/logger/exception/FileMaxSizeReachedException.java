package logger.exception;

public class FileMaxSizeReachedException extends Exception {

    public FileMaxSizeReachedException(String message) {
        super(message);
    }
}

