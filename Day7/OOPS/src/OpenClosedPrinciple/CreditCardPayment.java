package OpenClosedPrinciple;

/**
 * Implement payment methods for creditcard
 */
class CreditCardPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing Credit Card payment");
    }
}
