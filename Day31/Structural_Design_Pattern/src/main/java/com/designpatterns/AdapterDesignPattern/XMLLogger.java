package com.designpatterns.AdapterDesignPattern;

/**
 * The type Xml logger.
 */
class XMLLogger {
    /**
     * Log as xml.
     *
     * @param message the message
     */
    public void logAsXML(String message) {
        System.out.println("<log>" + message + "</log>");
    }
}
