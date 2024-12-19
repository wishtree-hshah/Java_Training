package com.mockito.services;

/**
 * The OrderService class handles order-related operations
 */
public class OrderService {
    private PaymentService paymentService;
    private NotificationService notificationService;

    /**
     * Constructor for OrderService
     * @param paymentService
     * @param notificationService
     */
    public OrderService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

    /**
     * Places an order by processing the payment and sending a notification
     * @param orderId
     * @param amount
     * @return
     */
    public String placeOrder(String orderId, double amount) {
        boolean paymentSuccessful = paymentService.processPayment(orderId, amount);

        if (paymentSuccessful) {
            notificationService.sendNotification(orderId, "Order placed successfully!");
            return "Order placed";
        } else {
            notificationService.sendNotification(orderId, "Payment failed");
            return "Order failed";
        }
    }
}

