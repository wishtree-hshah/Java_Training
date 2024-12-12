package SingleResponsibilityPrinciple;

/**
 * Main class to demonstrate the usage
 */
public class HotelManagement {
    public static void main(String[] args) {
        Booking booking = new Booking();
        booking.createBooking();

        InvoiceService invoiceService = new InvoiceService();
        invoiceService.generateInvoice();

        NotificationService notificationService = new NotificationService();
        notificationService.sendConfirmationEmail();
    }
}

