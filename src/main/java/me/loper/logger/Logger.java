package me.loper.logger;

public interface Logger {

    void info(String s);

    void warn(String s);

    void warn(String s, Throwable t);

    void severe(String s);

    void severe(String s, Throwable t);

    void debug(String s);

    void debug(String s, Throwable t);

}
