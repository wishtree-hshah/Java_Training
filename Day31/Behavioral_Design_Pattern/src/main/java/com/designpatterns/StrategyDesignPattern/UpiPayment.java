package com.designpatterns.StrategyDesignPattern;

/**
 * The type Upi payment.
 */
class UpiPayment implements PaymentStrategy {
    private String upiId;

    /**
     * Instantiates a new Upi payment.
     *
     * @param upiId the upi id
     */
    UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI: " + upiId);
    }
}
