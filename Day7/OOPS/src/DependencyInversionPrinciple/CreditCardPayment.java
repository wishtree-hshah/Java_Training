package DependencyInversionPrinciple;

/**
 * Concrete implementations of Payment by credit card
 */
public class CreditCardPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment via Credit Card");
    }
}
