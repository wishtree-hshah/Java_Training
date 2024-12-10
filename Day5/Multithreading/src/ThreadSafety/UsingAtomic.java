package ThreadSafety;

public class UsingAtomic {
    public static void main(
            String[] args) throws Exception
    {

        // Creating an instance of
        // Counter class
        Counter c = new Counter();

        // Creating an instance t1 of
        // Thread class
        Thread t1 = new Thread(
                new Runnable() {
                    public void run()
                    {
                        for (int i = 1; i <= 2000; i++) {
                            c.increment();
                        }
                    }
                });

        // Creating an instance t2
        // of Thread class
        Thread t2 = new Thread(
                new Runnable() {
                    public void run()
                    {
                        for (int i = 1; i <= 1000; i++) {
                            c.decrement();
                        }
                    }
                });

        // Calling start() method with t1 and t2
        t1.start();
        t2.start();

        // Calling join method with t1 and t2
        t1.join();
        t2.join();

        System.out.println(c.count);
    }
}
