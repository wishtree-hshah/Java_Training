package ThreadPoolExample;

import java.text.SimpleDateFormat;
import java.util.Date;

class ArithmeticTask implements Runnable {
    private int num1, num2;
    private String operation,name;

    public ArithmeticTask(int num1, int num2, String operation,String name) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
        this.name = name;
    }

    @Override
    public void run() {
        Date startTime = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss");

        // Print start time of the task
        System.out.println("Task [" + name + "] started at " + ft.format(startTime));

        int result = 0;
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            default:
                System.out.println("Unknown operation");
                return;
        }

        // Print result after task execution
        System.out.println("Result of " + operation + " for " + num1 + " and " + num2 + " is: " + result);

        Date endTime = new Date();
        // Print end time of the task
        System.out.println("Task [" + name + "] ended at " + ft.format(endTime));
    }
}