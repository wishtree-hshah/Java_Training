package com.mockito.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

/**
 * Mocking PaymentService and NotificationService
 */
public class OrderServiceTest {
    @Test
    public void placeOrderTest(){
        // Step 1: Mock dependencies
        PaymentService mockPaymentService = mock(PaymentService.class);
        NotificationService mockNotificationService = mock(NotificationService.class);

        // Step 2: Stub methods
        when(mockPaymentService.processPayment("123", 100.0)).thenReturn(true);

        // Step 3: Inject mocks into OrderService
        OrderService orderService = new OrderService(mockPaymentService, mockNotificationService);

        // Step 4: Call the method to test
        String result = orderService.placeOrder("123", 100.0);

        // Step 5: Verify behavior and assert result
        Assertions.assertEquals("Order placed", result);

        // Corrected verification
        verify(mockPaymentService).processPayment("123", 100.0);

        // The actual message is "Order placed successfully!"
        verify(mockNotificationService).sendNotification("123", "Order placed successfully!");
    }
}
