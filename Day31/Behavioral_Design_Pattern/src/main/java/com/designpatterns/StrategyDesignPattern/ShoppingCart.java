package com.designpatterns.StrategyDesignPattern;

/**
 * The type Shopping cart.
 */
class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    /**
     * Sets payment strategy.
     *
     * @param paymentStrategy the payment strategy
     */
    void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    /**
     * Checkout.
     *
     * @param amount the amount
     */
    void checkout(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
