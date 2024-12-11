package LockFramework;

public class LockExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        // Creating threads for withdrawals
        Thread t1 = new Thread(() -> account.withdraw(300), "Thread-Withdraw-1");
        Thread t2 = new Thread(() -> account.withdraw(500), "Thread-Withdraw-2");

        // Creating threads for deposits
        Thread t3 = new Thread(() -> account.deposit(200), "Thread-Deposit-1");
        Thread t4 = new Thread(() -> account.deposit(400), "Thread-Deposit-2");

        // Starting all threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
