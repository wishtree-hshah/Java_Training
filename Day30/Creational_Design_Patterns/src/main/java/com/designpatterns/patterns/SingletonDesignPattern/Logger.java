package com.designpatterns.patterns.SingletonDesignPattern;

/**
 * The type Logger.
 */
class Logger {
    private static Logger instance;

    private Logger() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    /**
     * Log.
     *
     * @param message the message
     */
    public void log(String message) {
        System.out.println("Log: " + message);
    }
}
