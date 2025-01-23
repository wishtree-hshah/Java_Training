package com.designpatterns.StrategyDesignPattern;

/**
 * The interface Payment strategy.
 */
interface PaymentStrategy {
    /**
     * Pay.
     *
     * @param amount the amount
     */
    void pay(int amount);
}
