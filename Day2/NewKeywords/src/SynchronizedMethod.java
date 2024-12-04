public class SynchronizedMethod {
    int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }

    public static void main(String[] args) {
        SynchronizedMethod synchronizedMethod = new SynchronizedMethod();

        // Thread 1 increments the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedMethod.increment();
            }
        });

        // Thread 2 increments the counter
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedMethod.increment();
            }
        });

        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + synchronizedMethod.getCount());
    }

}

//output:
//Final count: 2000