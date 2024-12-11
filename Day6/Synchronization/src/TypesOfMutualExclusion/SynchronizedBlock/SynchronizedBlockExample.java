package TypesOfMutualExclusion.SynchronizedBlock;

public class SynchronizedBlockExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> {
            try {
                account.transferMoney(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                account.transferMoney(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
    }
}
