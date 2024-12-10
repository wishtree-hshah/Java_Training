package ThreadSafety;

public class UsingVolatile {

    static int counter = 0; // Shared volatile variable

    static void increment() {
        counter++; // Incrementing the counter
    }

    static void printCounter() {
        System.out.println(Thread.currentThread().getName() + " Counter: " + counter);
    }

    public static void main(String[] args) {

        // Thread 1: Increment the counter
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                increment();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Increment-Thread");

        // Thread 2: Print the counter value
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                printCounter();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }, "Print-Thread");

        // Start threads
        t1.start();
        t2.start();
    }
}
