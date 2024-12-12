package OpenClosedPrinciple;

/**
 * Implement payment methods for UPIpayment
 */
class UPIPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing UPI payment");
    }
}
