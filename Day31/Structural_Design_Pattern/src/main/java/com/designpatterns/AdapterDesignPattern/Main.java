package com.designpatterns.AdapterDesignPattern;

/**
 * The type Main.
 */
class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Logger jsonLogger = new JSONLoggerAdapter();
        jsonLogger.log("This is a JSON log");

        Logger xmlLogger = new XMLLoggerAdapter();
        xmlLogger.log("This is an XML log");
    }
}
