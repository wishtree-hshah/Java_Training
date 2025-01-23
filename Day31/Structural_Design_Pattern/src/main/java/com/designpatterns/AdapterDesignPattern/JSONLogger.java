package com.designpatterns.AdapterDesignPattern;

class JSONLogger {
    public void logAsJSON(String message) {
        System.out.println("{ \"log\": \"" + message + "\" }");
    }
}
