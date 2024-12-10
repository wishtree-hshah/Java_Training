## Nested Interface:
- we can declare it as member of another class or another interface
- interface outside class can be declared as public or default only but inside class we can give all 4 access specifier but inside interface it must be public.
- To implement the interface that is inside class by: c_name.i_name

## Exception Handling:
- Exception is an unwanted or unexpected event, which occurs during the execution of a program

- Exceptions can be categorized in two ways:
    1. Built-in Exceptions: available in java class libraries:
        - Checked-exceptions: checked at compile-time by compiler.
        - Unchecked exceptions: opposite of checked
- Methods to print the Exception information:
    1. printStackTrace()
    2. toString() 
    3. getMessage() 

- How Does JVM Handle an Exception?
    1. exception occured
    2. created exception object and hands it JVM. (Name, description and current state of program)
    3. Now JVM finds the block of code that can handle exception (ExceptionHandler).
    4. Searches for the code to handle exception and proceeds to the call stack in reverse order.
    5. If it finds apprriate exception handler then it will create object and try to handle it
    6. if the exception handler is not found then it will send to the default exception handler which is part of runtime which prints the exception and terminates the program
    7. print exception, type of expection, stack trace, terminate the program

- try: contains set of stmts where an exception occurs
- catch: used to handle uncertain condition of the try block and it is followed by try block.
- throw: used to transfer control from try to catch
- throws: used for exception handling without try and catch block. it is thrown by method and doesn't handle that by itself
- finally: executed after try-catch block. resource deallocation

- final:
    - final with Class: The class cannot be subclassed.
    - final with Method: The method cannot be overridden by a subclass. 

## User-defined Custom Exception:
- why to use?
    
    1. Specific Error Handling
    2. Using custom exceptions with clear names makes the code easier to understand.

## Chained Exception:
- It is exception to realate one with another (one exception describe the cause of other)
- situation where it is used: a method throws arithematicExpression but it is caused due to i/o Error but the caller only knows about arithematic expression.
- Throwable(Throwable cause) :- causes the current exception.
- Throwable(String msg, Throwable cause) :- Where msg is the exception message and cause is the exception that causes the current exception.
- Methods Of Throwable class:

    1. getCause() method: when one exception is caused by another, allowing developers to trace the root cause of the error.
    2. initCause(Throwable cause): Can only be called once, calling it again throws an IllegalStateException, must be used before the exception is thrown.

## Null Pointer Exception:
- happens when a program attempts to use an object reference that has null value.

- ways to avoid NullPointerException: (code)

## Exception Handling with Method Overriding:
When Exception handling is involved with Method overriding, ambiguity occurs. The compiler gets confused as to which definition is to be followed. 
- Problem 1:  If The SuperClass doesn’t declare an exception
- Problem 2: If The SuperClass declares an exception

## Multithreading:
- allows simultaneous execution of two or more threads to maximize the utilization of CPU.
- Imagine using Microsoft Word for typing while listening to music:
    - Processes: Word and Music Player.
    - Multitasking: Running both simultaneously.
    - Multithreading: Spell check in Word runs as a thread while you type.

- Multitasking Types 
    - Multiprocessing:
        - Handles multiple processes (e.g., running Word and a Music Player).
        - Each process has its own memory space (heavyweight).
        - Switching between processes takes time and can cause minor delays.
    - Multithreading:
        - Handles multiple threads within a single process (e.g., typing in Word while spell check runs).
        - Threads share the same memory space (lightweight).
        - Switching between threads is fast and efficient.

- Thread Lifecycle
    1. New: Thread is created but not started.
    2. Runnable: Thread's start() method is called, waiting for CPU allocation.
    3. Running: Thread is actively executing its task.
    4. Blocked: Thread is waiting (e.g., for I/O or resource availability).
    5. Terminated: Thread finishes execution or stop() is invoked.

- Process Scheduling Algorithms
    1. First In First Out (FIFO): Processes are executed in the order they arrive.
    2. Last In First Out (LIFO): The most recent process is executed first.
    3. Round Robin Scheduling: Processes take turns, cycling through a time slice.

- Deadlocks with Threads: In a deadlock, threads wait indefinitely due to circular resource dependencies. Thread scheduling avoids such issues by managing switching and execution internally.

- Advantages of Multithreading:
    1. Non-blocking Operations: Threads are independent. If one fails, others continue.
    2. Time-saving: Multiple tasks execute simultaneously, improving efficiency.
    3. Shared Address Space: Threads share memory, reducing overhead while maintaining independence.

- Two Ways to Implement Multithreading in Java:
    1. Using Thread Class: the class in which it extends then we can't extend that class to other. (tight coupling)
    2. Using Runnable Interface: we can extend that class to another. (loose coupling)

- Thread States and Methods
    1. start(): Begins thread execution.
    2. sleep(): Makes the thread pause for a specified time.
    3. join(): Waits for a thread to complete before proceeding.
    4. getState(): Returns the current state of the thread.

## Regex:
- email and passwords validations where regex is widely used.
- Common Regex Patterns:
    1. .: Matches any character except newline.
    2. *: Matches zero or more of the preceding element.
    3. +: Matches one or more of the preceding element.
    4. ?: Matches zero or one of the preceding element.
    5. []: Matches any one of the characters inside the brackets.
    6. |: Acts as a logical OR in regex.
    7. ^: Anchors the regex at the beginning of the string.
    8. $: Anchors the regex at the end of the string.
