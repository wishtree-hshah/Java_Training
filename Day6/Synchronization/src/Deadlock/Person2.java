package Deadlock;

class Person2 extends Thread {
    private Pen pen;
    private Notebook notebook;

    // Constructor to initialize Pen and Notebook
    public Person2(Pen pen, Notebook notebook) {
        this.pen = pen;
        this.notebook = notebook;
    }

    @Override
    public void run() {
        // Person2 uses notebook and then tries to use the pen
        notebook.usePen(pen);
    }
}
