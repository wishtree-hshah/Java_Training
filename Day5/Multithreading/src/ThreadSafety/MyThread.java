package ThreadSafety;

public class MyThread extends Thread {
    Table table;
    int number;

    MyThread(Table table, int number) {
        this.table = table;
        this.number = number;
    }

    public void run() {
        table.printTable(number);
    }
}
