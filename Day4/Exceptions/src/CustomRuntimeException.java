// Custom exception for invalid transactions (unchecked Exception)
class InvalidTransactionException extends RuntimeException {
    public InvalidTransactionException(String message) {
        super(message);
    }
}

public class CustomRuntimeException {
    // Method to withdraw money from an account
    public static void withdrawMoney(double balance, double amount) {
        // Business rule: Withdrawal amount must not exceed the balance
        if (amount > balance) {
            throw new InvalidTransactionException("Insufficient funds. Attempted to withdraw: " + amount);
        }
        System.out.println("Withdrawal of " + amount + " successful! Remaining balance: " + (balance - amount));
    }

    public static void main(String[] args) {
        try {
            // Attempt to withdraw more money than the account balance
            withdrawMoney(5000.00, 6000.00); // This will throw an exception
        } catch (InvalidTransactionException e) {
            // Handle the exception by displaying an appropriate error message
            System.out.println("Transaction Failed: " + e.getMessage());
        }

        // Successful withdrawal
        withdrawMoney(5000.00, 3000.00);
    }
}
