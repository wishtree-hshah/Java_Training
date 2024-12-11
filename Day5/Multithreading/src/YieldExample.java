public class YieldExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1 - " + i);
                Thread.yield(); // Hinting to pause
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 2 - " + i);
            }
        });

        t1.start();
        t2.start();
    }
}
