package OpenClosedPrinciple;

/**
 * Implement payment methods for paypalpayment
 */
class PayPalPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing PayPal payment");
    }
}
