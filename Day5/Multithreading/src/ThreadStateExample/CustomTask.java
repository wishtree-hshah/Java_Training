package ThreadStateExample;

class CustomTask implements Runnable {
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() + " is in RUNNABLE state.");
            Thread.sleep(500); // TIMED_WAITING state
            System.out.println(Thread.currentThread().getName() + " has finished execution.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
