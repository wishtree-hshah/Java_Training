package com.designpatterns.patterns.AbstractFactoryPattern;

/**
 * The type Modern table.
 */
class ModernTable implements Table {
    public void create() {
        System.out.println("Modern Table created.");
    }
}
