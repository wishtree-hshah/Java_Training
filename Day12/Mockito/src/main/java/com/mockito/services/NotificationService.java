package com.mockito.services;

/**
 * The NotificationService class handles sending notifications
 */
public class NotificationService {
    /**
     * Sends a notification with a specific message for a given order
     * @param orderId
     * @param message
     */
    public void sendNotification(String orderId, String message) {
        System.out.println("Notification for " + orderId + ": " + message);
    }
}

