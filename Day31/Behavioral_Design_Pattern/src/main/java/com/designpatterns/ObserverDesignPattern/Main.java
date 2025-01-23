package com.designpatterns.ObserverDesignPattern;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Newsletter newsletter = new Newsletter();

        Subscriber alice = new Subscriber("Alice");
        Subscriber bob = new Subscriber("Bob");

        newsletter.subscribe(alice);
        newsletter.subscribe(bob);

        newsletter.publish("New Java Design Patterns Article is Live!");

        newsletter.unsubscribe(alice);
        newsletter.publish("Advanced Observer Pattern Explained!");
    }
}
