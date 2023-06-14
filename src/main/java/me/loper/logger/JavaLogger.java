package me.loper.logger;

import java.util.logging.Level;

public class JavaLogger implements Logger {
    private final java.util.logging.Logger logger;

    public JavaLogger(final java.util.logging.Logger logger) {
        this.logger = logger;
    }

    @Override
    public void info(String s) {
        this.logger.info(s);
    }

    @Override
    public void warn(String s) {
        this.logger.warning(s);
    }

    @Override
    public void warn(String s, Throwable t) {
        this.logger.log(Level.WARNING, s, t);
    }

    @Override
    public void severe(String s) {
        this.logger.severe(s);
    }

    @Override
    public void severe(String s, Throwable t) {
        this.logger.log(Level.SEVERE, s, t);
    }
}
