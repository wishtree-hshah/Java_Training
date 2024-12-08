class BankTransaction {

    // SuperClass method with no exception declared
    void processTransaction(String accountFile) {
        System.out.println("super class processTransaction");
    }

    void divideAmount(double amount, int recipients){
        System.out.println("super class divideAmount");
    }
}

class OnlineTransaction extends BankTransaction {

    // Unchecked Exception example: ArithmeticException
    @Override
    void divideAmount(double amount, int recipients) throws ArithmeticException {
        System.out.println("Each recipient gets: " + (amount / recipients));
    }

    // Checked Exception example: FileNotFoundException
    // we can't do this becoz Callers using a superclass reference
    // wouldn't expect checked exceptions, leading to compilation issues.
    @Override
    void processTransaction(String accountFile) throws FileNotFoundException {
        System.out.println("Account file " + accountFile + " found. Transaction processing...");
    }
}

public class SuperClassWithoutException {
    public static void main(String[] args) {
        BankTransaction bankTransaction = new OnlineTransaction();
        bankTransaction.divideAmount(5000,5);
        bankTransaction.processTransaction("hello");
    }
}
