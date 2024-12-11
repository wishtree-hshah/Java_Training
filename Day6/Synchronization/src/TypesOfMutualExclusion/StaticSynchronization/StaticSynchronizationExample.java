package TypesOfMutualExclusion.StaticSynchronization;

public class StaticSynchronizationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount account1 = new BankAccount();

        Thread t1 = new Thread(() -> {
            try {
                account.transferMoney(1000);
                System.out.println("Thread1: " + account.getBalance());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                account1.transferMoney(500);
                System.out.println("Thread2: " + account1.getBalance());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}
