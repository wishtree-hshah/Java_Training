package ThreadSafety;

import java.util.concurrent.atomic.AtomicInteger;

class Counter {

    // Creating a variable of class type AtomicInteger
    AtomicInteger count
            = new AtomicInteger(0);

    // Defining increment() method to change value of
    // AtomicInteger variable
    public void increment()
    {
        count.incrementAndGet();
    }

    public void decrement(){
        count.decrementAndGet();
    }
}