package com.mockito.services;

public class NotificationService {
    public void sendNotification(String orderId, String message) {
        System.out.println("Notification for " + orderId + ": " + message);
    }
}

