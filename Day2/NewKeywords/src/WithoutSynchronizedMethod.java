public class WithoutSynchronizedMethod {
    int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    public static void main(String[] args) {
        WithoutSynchronizedMethod withoutSynchronizedMethod = new WithoutSynchronizedMethod();

        // Thread 1 increments the counter
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                withoutSynchronizedMethod.increment();
            }
        });

        // Thread 2 increments the counter
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                withoutSynchronizedMethod.increment();
            }
        });

        thread1.start();
        thread2.start();

        // Don't Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + withoutSynchronizedMethod.getCount());
    }

}

//output
//Final count: 1545
//This is due to race condition where the execution of thread is not decided
//two or more threads same resources
