package com.designpatterns.patterns.AbstractFactoryPattern;

/**
 * The type Victorian table.
 */
class VictorianTable implements Table {
    public void create() {
        System.out.println("Victorian Table created.");
    }
}
