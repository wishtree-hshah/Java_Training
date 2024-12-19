package com.mockito.services;

public class OrderService {
    private PaymentService paymentService;
    private NotificationService notificationService;

    public OrderService(PaymentService paymentService, NotificationService notificationService) {
        this.paymentService = paymentService;
        this.notificationService = notificationService;
    }

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

