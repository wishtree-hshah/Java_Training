package Deadlock;

public class DeadlockExample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Notebook notebook = new Notebook();

        Person1 p1 = new Person1(pen, notebook);
        Person2 p2 = new Person2(pen, notebook);

        p1.setName("Person1");
        p2.setName("Person2");

        p1.start();
        p2.start();
    }
}
