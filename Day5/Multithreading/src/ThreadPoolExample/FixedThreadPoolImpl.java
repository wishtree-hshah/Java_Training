package ThreadPoolExample;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolImpl {
    public static void main(String[] args) {
        // Create a fixed thread pool with 3 threads
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        // Create tasks
        Runnable task1 = new ArithmeticTask(10, 5, "add","Task 1");
        Runnable task2 = new ArithmeticTask(20, 5, "subtract", "Task 2");
        Runnable task3 = new ArithmeticTask(100, 50, "add", "Task 3");
        Runnable task4 = new ArithmeticTask(40, 10, "subtract", "Task 4");
        Runnable task5 = new ArithmeticTask(5, 3, "add", "Task 5");

        // Submit tasks to the thread pool
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);
        executorService.submit(task4);
        executorService.submit(task5);

        // Shutdown the executor
        executorService.shutdown();
    }
}
