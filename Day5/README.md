## Multithreading:
- Threads are like sub processes inside a program that help it do multiple tasks at the same time.
- So this multitasking (multiple task) can be enabled in two ways:
    1. Process-Based Multitasking:
        - each process allocated a seperate memory area.
        - HeavyWeight
        - cost of communication is high
    2. Thread-Based Multitasking:
        - lightweight 
        - shares the same address space
        - cost of communication is low

## How to Create Threads?
- Extending Thread Class
    - Thread: This is simple but less flexible, as extending Thread means you can't extend another class.
    - Thread(Runnable r):  When you already have a class extending another class but want it to execute in a separate thread.
    - Thread(String name): When you want to track or differentiate threads based on their names
    - Thread(Runnable r, String name): When you need the flexibility of a Runnable and the clarity of a named thread for debugging or logging.

- Run interface will not able to handle checked exception so write try-catch block but it can handle unchecked exception.

- Some methods:

    1. currentThread(): to get reference of current thread.
    2. getName()/setName(): getting/setting current thread name.
    3. getPriority()/setPriority(): getting/setting thread priority.
        - By default main thread priority is 5.
        - MAX_PRIORITY: 10
        - MIN_PRIORITY: 1
        - If two threads have the same priority then we can’t expect which thread will execute first. It depends on the thread scheduler’s algorithm(Round-Robin, First Come First Serve, etc)

- difference between start() and run():

    1. Invoking start() creates a new thread and begins its execution while directly calling run() does not create a new thread ans executes the run in the current thread like regular method call.
    2. start() can’t be invoked more than one time otherwise throws java.lang.IllegalStateException because Java Thread Life Cycle does not allow a thread to return to the NEW state once it has transitioned to RUNNABLE or beyond while run() multiple invocation is possible
    3. start(): java.lang.Thread class and run(): java.lang.Runnable 

- Thread.sleep():
    - pauses the current thread execution
    - if any thread interrupts when the thread is sleeping then InterruptedException will be thrown

- Daemon Thread: 
    - Whenever the last non-daemon thread terminates, all the daemon threads will be terminated automatically.
    - calling the setDaemon() method after starting the thread, it would throw IllegalThreadStateException.

## Thread Safety:
- when multiple threads working on same data leads to inconsistency of results.
- so the working thread prevents other thread to work on same object is call thread safety.

- 4 ways to achieve thread safety:

    1. Using Synchronization (access Modifier)
        - Synchronization is used to resolve inconsistency problem by allowing only one thread at a time. 
        - Synchronized is the modifier that creates a block of code known as a critical section. 

    2. Using Volatile: (Keyword)
        - Without volatile: 
            - Threads may cache variables locally
            - Updates by one thread might not be visible to others.
        - With Volatile:
            - Variables are always read from memory.
            - Updates are immediately visible to all threads
    
    3. AtomicInteger: (Variable)
        - To handle Shared rescouce in multithreaded enviroment.

    4. final: (keyword)
        - once assigned the reference can't be changed

- when to use:
    - Synchronized: You need to ensure exclusive access to a critical section of code
    - Volatile: You only need visibility between threads for a single variable
    - AtomicInteger: You need a thread-safe, lock-free integer that supports atomic updates

## ThreadPool:

- Instead of creating new thread everytime a task need to be done by reusing the threads that are already created.

- How it works:
    - When you want to perform a task, you send it to the thread pool.
    - If there’s an available thread, it will run the task.
    - If all threads are busy, it will wait for a thread to become available or create a new one (based on the pool size).
    - Once the task is done, the thread is available for another task.

- Types of Thread Pools in Java:
    1. FixedThreadPool: A thread pool with a fixed number of threads. If all threads are busy, the tasks will wait in a queue.
    2. CachedThreadPool: Creates new threads when needed, but reuses threads that are no longer active.
    3. SingleThreadExecutor: Uses only one thread to execute tasks sequentially.
