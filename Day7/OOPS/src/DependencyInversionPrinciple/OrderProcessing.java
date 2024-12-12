package DependencyInversionPrinciple;

/**
 * High-level module (depends on abstraction) i.e. payment
 * when the order is placed then only payment will be done
 */
public class OrderProcessing {
    private Payment payment;

    public OrderProcessing(Payment payment) {
        this.payment = payment;
    }

    public void processOrder() {
        payment.processPayment();
    }
}
