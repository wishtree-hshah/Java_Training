package OpenClosedPrinciple;

/**
 * Payment Processor uses the Payment interface
 */
public class PaymentProcessor {
    public void processPayment(Payment payment) {
        payment.process(); // Polymorphic behavior
    }

    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        processor.processPayment(new CreditCardPayment());
        processor.processPayment(new PayPalPayment());
        processor.processPayment(new UPIPayment());
    }
}

