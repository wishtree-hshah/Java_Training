package com.designpatterns.ObserverDesignPattern;

/**
 * The type Subscriber.
 */
class Subscriber implements Observer {
    private String name;

    /**
     * Instantiates a new Subscriber.
     *
     * @param name the name
     */
    Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}
