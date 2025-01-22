package com.designpatterns.patterns.AbstractFactoryPattern;

/**
 * The type Victorian chair.
 */
class VictorianChair implements Chair {
    public void create() {
        System.out.println("Victorian Chair created.");
    }
}
