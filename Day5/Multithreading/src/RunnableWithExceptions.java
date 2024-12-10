import java.io.FileNotFoundException;

public class RunnableWithExceptions {
    public static void main(String[] args)
    {
        System.out.println("Main thread is- " +
                Thread.currentThread().getName());
        Thread t1 = new Thread(new RunnableWithExceptions().new RunnableImpl());
        t1.start();
    }

    private class RunnableImpl implements Runnable {

        public void run()
        {
            System.out.println(Thread.currentThread().getName()
                    + ", executing run() method!");

            //To handle unchecked exception
            try {
                throw new FileNotFoundException();
            }
            catch (FileNotFoundException e) {
                System.out.println("Must catch here!");
                e.printStackTrace();
            }
            throw new NullPointerException();
        }
    }
}
