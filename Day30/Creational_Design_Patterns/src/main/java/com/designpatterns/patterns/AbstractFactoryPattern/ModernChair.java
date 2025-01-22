package com.designpatterns.patterns.AbstractFactoryPattern;

/**
 * The type Modern chair.
 */
class ModernChair implements Chair {
    public void create() {
        System.out.println("Modern Chair created.");
    }
}
