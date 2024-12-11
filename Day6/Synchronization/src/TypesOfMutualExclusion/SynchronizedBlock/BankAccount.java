package TypesOfMutualExclusion.SynchronizedBlock;

class BankAccount {
    private int balance = 0;

    /**
     *
     * @param amount
     * @throws InterruptedException
     */
    // Synchronized method
    // update the balance after 1 sec
    public void transferMoney(int amount) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " started....");
        synchronized (this){
            System.out.println("Thread " + Thread.currentThread().getId() + " is transferring " + amount);
            Thread.sleep(1000);
            balance += amount;
            System.out.println("Thread " + Thread.currentThread().getId() + " has completed the transfer of " + amount);
        }
        System.out.println(Thread.currentThread().getName() + " ended....");
    }
}
