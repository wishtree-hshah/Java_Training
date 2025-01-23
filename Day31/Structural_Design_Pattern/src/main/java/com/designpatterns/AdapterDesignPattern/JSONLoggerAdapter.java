package com.designpatterns.AdapterDesignPattern;

/**
 * The type Json logger adapter.
 */
class JSONLoggerAdapter implements Logger {
    private JSONLogger jsonLogger;

    /**
     * Instantiates a new Json logger adapter.
     */
    public JSONLoggerAdapter() {
        jsonLogger = new JSONLogger();
    }

    public void log(String message) {
        jsonLogger.logAsJSON(message);
    }
}
