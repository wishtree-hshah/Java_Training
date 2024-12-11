package TypesOfMutualExclusion.SynchronizedMethod;

public class SynchronizedMethodExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

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
                account.transferMoney(500);
                System.out.println("Thread2: " + account.getBalance());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}

