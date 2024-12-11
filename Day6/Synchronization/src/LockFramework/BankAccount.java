package LockFramework;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private double balance = 1000; // Initial balance
    private final Lock withdrawLock = new ReentrantLock();
    private final Lock depositLock = new ReentrantLock();

    // Withdraw money - uses withdrawLock
    public void withdraw(double amount) {
        withdrawLock.lock();
        try {
            if (balance >= amount) {
                System.out.println(Thread.currentThread().getName() + " is withdrawing: $" + amount);
                Thread.sleep(1000); // Simulating delay
                balance -= amount;
                System.out.println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: $" + balance);
            } else {
                System.out.println(Thread.currentThread().getName() + " - Insufficient funds for withdrawal.");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            withdrawLock.unlock();
        }
    }

    // Deposit money - uses depositLock
    public void deposit(double amount) {
        depositLock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " is depositing: $" + amount);
            Thread.sleep(1000); // Simulating delay
            balance += amount;
            System.out.println(Thread.currentThread().getName() + " completed deposit. New balance: $" + balance);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            depositLock.unlock();
        }
    }
}