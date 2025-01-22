package com.designpatterns.patterns.AbstractFactoryPattern;

/**
 * The type Modern furniture factory.
 */
class ModernFurnitureFactory implements FurnitureFactory {
    public Chair createChair() {
        return new ModernChair();
    }

    public Table createTable() {
        return new ModernTable();
    }
}
