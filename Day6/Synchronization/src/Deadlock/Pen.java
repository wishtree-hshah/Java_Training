package Deadlock;

class Pen {
    // Synchronized method to use the notebook with the pen
    synchronized void useNotebook(Notebook notebook) {
        System.out.println(Thread.currentThread().getName() + " has the pen and wants the notebook.");
        // Calls notebook's use method
        notebook.use();
    }

    // Synchronized method to use the pen
    synchronized void use() {
        System.out.println(Thread.currentThread().getName() + " is using the pen.");
    }
}
