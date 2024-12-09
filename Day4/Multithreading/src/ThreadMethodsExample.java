class MyThread extends Thread {
    public MyThread(String name) {
        setName(name); // Setting thread name
    }

    @Override
    public void run() {
        System.out.println(getName() + " is running.");
        try {
            Thread.sleep(1000); // Pauses the thread for 1 second
        } catch (InterruptedException e) {
            System.out.println(getName() + " was interrupted.");
        }
    }
}

public class ThreadMethodsExample {
    public static void main(String[] args) throws InterruptedException {
        // Creating and configuring threads
        MyThread myThread1 = new MyThread("Thread-1");
        MyThread myThread2 = new MyThread("Thread-2");

        myThread1.setDaemon(true); // Marking myThread1 as a daemon thread (low-priority)
        System.out.println("Is " + myThread1.getName() + " a daemon? " + myThread1.isDaemon());

        myThread1.start(); // Starting myThread1
        myThread2.start(); // Starting myThread2

        // Properly handling the completion
        myThread2.join(); // Ensures myThread2 completes before proceeding
        System.out.println("Execution completed.");
    }
}
