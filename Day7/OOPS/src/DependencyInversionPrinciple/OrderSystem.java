package DependencyInversionPrinciple;

/**
 * class to create order and make payments
 */
public class OrderSystem {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        OrderProcessing order = new OrderProcessing(payment);
        order.processOrder();  // Output: Processing payment via Credit Card

        payment = new PayPalPayment();
        OrderProcessing order2 = new OrderProcessing(payment);
        order2.processOrder();  // Output: Processing payment via PayPal
    }
}
