package com.designpatterns.patterns.AbstractFactoryPattern;

/**
 * The type Victorian furniture factory.
 */
class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new VictorianChair();
    }

    public Table createTable() {
        return new VictorianTable();
    }
}
