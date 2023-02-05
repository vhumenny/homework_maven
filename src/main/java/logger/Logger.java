package logger;

public abstract class Logger {

    private String debugMessage = "debug method is running";
    private String infoMessage = "info method is running";

    public abstract void debug(String debugMessage);

    public abstract void info(String infoMessage);

    public String getDebugMessage() {
        return debugMessage;
    }

    public void setDebugMessage(String debugMessage) {
        this.debugMessage = debugMessage;
    }

    public String getInfoMessage() {
        return infoMessage;
    }

    public void setInfoMessage(String infoMessage) {
        this.infoMessage = infoMessage;
    }
}
