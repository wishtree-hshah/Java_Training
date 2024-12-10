package ThreadStateExample;

public class ThreadState {
    public static Thread thread1;

    public static void main(String[] args) {
        thread1 = new Thread(new CustomTask(), "Thread-1");

        // Print state before starting
        System.out.println(thread1.getName() + " state: " + thread1.getState()); // NEW

        // Start the thread
        thread1.start();
        System.out.println(thread1.getName() + " state after start(): " + thread1.getState()); // RUNNABLE

        // Monitor the thread states
        try {
            Thread.sleep(100); // Allow time for thread1 to start execution
            System.out.println(thread1.getName() + " state during sleep(): " + thread1.getState()); // TIMED_WAITING
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print final state
        System.out.println(thread1.getName() + " state after completion: " + thread1.getState()); // TERMINATED
    }
}
