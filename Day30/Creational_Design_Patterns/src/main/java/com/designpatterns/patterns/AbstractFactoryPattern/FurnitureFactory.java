package com.designpatterns.patterns.AbstractFactoryPattern;

/**
 * The interface Furniture factory.
 */
interface FurnitureFactory {
    /**
     * Create chair chair.
     *
     * @return the chair
     */
    Chair createChair();

    /**
     * Create table table.
     *
     * @return the table
     */
    Table createTable();
}
