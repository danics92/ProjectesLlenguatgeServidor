package ioc;

/**
 * Created by dcatalans on 14/10/16.
 */
public class LogAbstract implements Log {
    @Override
    public void logInfo(String textToLog) {

    }

    @Override
    public void logWarn(String textToLog) {

    }

    @Override
    public void logError(String textToLog) {

    }

    private boolean logError;
    private boolean logWarn;
    private boolean logInfo;

    protected final String INFO_PREFIX = "INFO ";
    protected final String WARN_PREFIX = "WARN ";
    protected final String ERROR_PREFIX = "WARN ";


    public boolean isLogError() {
        return logError;
    }

    public void setLogError(boolean logError) {
        this.logError = logError;
    }

    public boolean isLogWarn() {
        return logWarn;
    }

    public void setLogWarn(boolean logWarn) {
        this.logWarn = logWarn;
    }

    public boolean isLogInfo() {
        return logInfo;
    }

    public void setLogInfo(boolean logInfo) {
        this.logInfo = logInfo;
    }
}
