package Deadlock;

class Person1 extends Thread {
    private Pen pen;
    private Notebook notebook;

    // Constructor to initialize Pen and Notebook
    public Person1(Pen pen, Notebook notebook) {
        this.pen = pen;
        this.notebook = notebook;
    }

    @Override
    public void run() {
        // Person1 uses pen and then tries to use the notebook
        pen.useNotebook(notebook);
    }
}
