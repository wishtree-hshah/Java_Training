package com.designpatterns.StrategyDesignPattern;

/**
 * The type Pay pal payment.
 */
class PayPalPayment implements PaymentStrategy {
    private String email;

    /**
     * Instantiates a new Pay pal payment.
     *
     * @param email the email
     */
    PayPalPayment(String email) {
        this.email = email;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal: " + email);
    }
}
