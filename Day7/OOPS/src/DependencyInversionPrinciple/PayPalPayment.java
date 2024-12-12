package DependencyInversionPrinciple;

/**
 * Concrete implementations of Payment by paypal
 */
public class PayPalPayment implements Payment {
    @Override
    public void processPayment() {
        System.out.println("Processing payment via PayPal");
    }
}
