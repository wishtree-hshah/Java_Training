package com.designpatterns.AdapterDesignPattern;

/**
 * The type Xml logger adapter.
 */
class XMLLoggerAdapter implements Logger {
    private XMLLogger xmlLogger;

    /**
     * Instantiates a new Xml logger adapter.
     */
    public XMLLoggerAdapter() {
        xmlLogger = new XMLLogger();
    }

    public void log(String message) {
        xmlLogger.logAsXML(message);
    }
}
