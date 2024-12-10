package ThreadSafety;

public class UsingSynchronized {
    public static void main(String[] args) {
        Table table = new Table();

        Thread t1 = new MyThread(table, 5);
        Thread t2 = new MyThread(table, 10);

        t1.setName("Thread A");
        t2.setName("Thread B");

        t1.start();
        t2.start();
    }
}
