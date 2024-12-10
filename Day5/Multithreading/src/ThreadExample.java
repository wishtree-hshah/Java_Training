// Java program demonstrating various Thread methods

// Class 1 - Helper class implementing Runnable interface
class Helper implements Runnable {
    public void run() {
        try {
            System.out.println("Helper thread going to sleep for 3000 ms");
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Helper thread interrupted");
        }
    }
}

// Class 2 - Main class demonstrating Thread methods
public class ThreadExample {

    public static void main(String[] args) {

        // Creating objects of Helper class
        Helper helperObj = new Helper();

        // Creating threads
        Thread thread1 = new Thread(helperObj);
        Thread thread2 = new Thread(helperObj);

        // Set thread2 as a daemon before starting it
        thread2.setDaemon(true);

        // Start threads
        thread1.start();
        thread2.start();

        // Fetching current thread details
        Thread currentThread = Thread.currentThread();

        // Print current thread name
        System.out.println("Current Thread Name: " + currentThread.getName());

        // Display thread1 details
        System.out.println("Thread1 Name: " + thread1.getName());
        System.out.println("Thread1 ID: " + thread1.getId());

        // Checking priority and state of thread1
        System.out.println("Thread1 Priority: " + thread1.getPriority());
        System.out.println("Thread1 State: " + thread1.getState());

        // Interrupt thread2
        thread2.interrupt();
        System.out.println("Is thread2 interrupted? " + thread2.isInterrupted());

        // Check if thread1 is alive
        System.out.println("Is thread1 alive? " + thread1.isAlive());

        // Waiting for thread1 to finish execution using join()
        try {
            thread1.join();
            System.out.println("Thread1 has finished execution");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Setting thread1 name
        thread1.setName("Custom Thread Name");
        System.out.println("New name set for thread1: " + thread1.getName());

        // Fetching stack trace for thread1
        StackTraceElement[] trace = thread1.getStackTrace();
        System.out.println("Stack Trace for thread1:");
        for (StackTraceElement element : trace) {
            System.out.println(element);
        }

        // Get thread group of thread1
        ThreadGroup threadGroup = thread1.getThreadGroup();
        System.out.println("Thread Group of thread1: " + threadGroup);

        // Checking if thread1 holds lock on the helper object
        System.out.println("Does thread1 hold lock on helper object? " + thread1.holdsLock(helperObj));

        // Displaying all active threads in the current thread group
        Thread[] activeThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(activeThreads);
        System.out.println("Active Threads:");
        for (Thread t : activeThreads) {
            System.out.println(t);
        }

        // Dump stack trace for the current thread
        System.out.println("Dumping stack trace of the current thread:");
        Thread.dumpStack();
    }
}
