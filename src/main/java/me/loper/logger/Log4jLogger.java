package me.loper.logger;

public class Log4jLogger implements Logger {
    private final org.apache.logging.log4j.Logger logger;

    public Log4jLogger(org.apache.logging.log4j.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void info(String s) {
        this.logger.info(s);
    }

    @Override
    public void warn(String s) {
        this.logger.warn(s);
    }

    @Override
    public void warn(String s, Throwable t) {
        this.logger.warn(s, t);
    }

    @Override
    public void severe(String s) {
        this.logger.error(s);
    }

    @Override
    public void severe(String s, Throwable t) {
        this.logger.error(s, t);
    }

    @Override
    public void debug(String s) {
        this.logger.debug(s);
    }

    @Override
    public void debug(String s, Throwable t) {
        this.logger.debug(s, t);
    }
}