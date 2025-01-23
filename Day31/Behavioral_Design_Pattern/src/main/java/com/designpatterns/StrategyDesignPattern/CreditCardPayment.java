package com.designpatterns.StrategyDesignPattern;

/**
 * The type Credit card payment.
 */
class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    /**
     * Instantiates a new Credit card payment.
     *
     * @param cardNumber the card number
     */
    CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card: " + cardNumber);
    }
}
