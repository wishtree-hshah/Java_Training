package Deadlock;

class Notebook {
    // Synchronized method to use the pen with the notebook
    synchronized void usePen(Pen pen) {
        System.out.println(Thread.currentThread().getName() + " has the notebook and wants the pen.");
        // Calls pen's use method
        pen.use();
    }

    // Synchronized method to use the notebook
    synchronized void use() {
        System.out.println(Thread.currentThread().getName() + " is using the notebook.");
    }
}
