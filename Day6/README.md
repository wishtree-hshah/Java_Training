**where and why wait() is defined?**
wait() is defined in object class because since every object can be used as a lock (monitor), these methods are available on all objects.

**Yeild():**
 Simply hints the scheduler; there is no guarantee of a pause. Threads of equal or higher priority might get a chance to execute.

 ## Synchronization:
 - make sure that only one thread can access the resource at a given point in time. 
 - is implemented with a concept called monitor or lock.
 - when a thread acquires a lock, it is said to enter the monitor
 - Types of Synchronization
    1. Process Synchronization: coordinate the execution of multiple processes
    2. Thread Synchronization: coordinate and ordering of the execution of the threads in a multi-threaded program
- thread synchronization types:
    1. Mutual Exclusive
        - Synchronized method.
        - Synchronized block.
        - Static synchronization.
    2. Cooperation (Inter-thread communication in Java)

## Lock Framework vs Synchronized in Java

| **Feature**             | **Lock Framework**                                                                                       | **Synchronized**                                                                                 |
|-------------------------|----------------------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------|
| **Across Methods**      | Lock can be acquired in one method and released in another, giving more control.                         | Cannot be used across methods; works only within a specific synchronized block or method.        |
| **Try to Acquire Lock** | Allows trying to get a lock using `tryLock(timeout)` without blocking indefinitely.                       | Always blocks until the lock is available.                                                      |
| **Fair Lock Management**| Supports fairness, ensuring threads waiting longer get the lock first if fairness mode is enabled.        | No fairness mechanism; locks are granted randomly.                                              |
| **View Waiting Threads**| Can provide a list of threads waiting for the lock, which helps in debugging or monitoring.              | Does not provide any way to see the waiting threads.                                             |
| **Exception Handling**  | Lock must be manually released using `unlock()`, which can be tricky if an exception occurs.              | Automatically releases the lock when the synchronized block or method ends, even if an exception occurs. |

## Deadlock Characteristics:
- Mutual Exclusion: Resources are non-shareable.
- Hold and Wait: A process holds resources while waiting for others.
- No Preemption: Resources cannot be forcibly taken from processes.
- Circular Wait: A cycle of processes, each waiting for the next.

## Deadlock Prevention:
- Eliminate Mutual Exclusion: Impossible for some resources (e.g., printers).
- Eliminate Hold and Wait: Allocate all resources before process starts (leads to low utilization).
- Eliminate No Preemption: Preempt resources from low-priority processes.
- Eliminate Circular Wait: Assign resources a numerical order to prevent circular dependencies.

## Prevention vs Recovery:

- Prevention: Avoids deadlocks before they occur.
- Detection/Recovery: Identifies and resolves deadlocks after they happen.

## Deadlock Ignorance:

- Known as the Ostrich Algorithm, this approach involves ignoring deadlock and assuming that it rarely occurs. If deadlock happens, the operating system may reboot the system to restore normal operation.
- Engineers often prioritize other system issues (e.g., system failures, hardware crashes) over deadlock because deadlock occurrences are considered infrequent and less critical in some scenarios.

## Recovery Methods:
1. Process Termination:
    - Abort all deadlocked processes
    - Abort one process at a time
    - Advantages: Simple, fast resolution
    - Disadvantages: Loss of data, potential system disruption, resource waste if processes were close to completion
2. Resource Preemption
    - Advantages: Avoids process termination, efficient, does not require restarting the system
    - Disadvantages: Increases overhead, can disrupt critical processes, delays completion if resources are frequently preempted
3. Priority Inversion: can lead to performance issues and potential starvation of lower-priority processes
4. Rollback: Revert to a previous system state before the deadlock, particularly used in database systems
5. Resource Allocation Graph (RAG):A visual representation of resource allocation between processes. Helps in quick detection of deadlock

# Networking and Socket Programming: 

- enables communication between two or more devices to share resources over network.
- networking capabilities in the java.net to create programs that communicate over the network
- TCP (Transmission Control Protocol):
    - Connection-oriented
    - Reliable data transmission with error checking
    - Guarantees correct order of data
    - Used for web browsing, file transfer, email
    - Works with IP to form TCP/IP
- UDP (User Datagram Protocol):
    - Connectionless
    - No guarantee of delivery, error checking, or order
    - Suitable for real-time applications (e.g., video streaming, gaming) where speed matters more than reliability
- Java Networking Terminology
    - IP Address: Unique address that identifies a device on a network. Range: 0.0.0.0 to 255.255.255.255. Example: 192.168.0.1.
    - Port Number: Identifies a specific process or application on a device, facilitating communication between applications. There are 65,535 port numbers.
    - Protocol: A set of rules defining how data is transmitted between devices.
    - MAC Address: Unique identifier for a device’s network interface, used to track devices on a network. Typically 48 or 64 bits in hexadecimal.
    - Socket: Endpoint for two-way communication between applications. Tied to a port number for data transmission.
    - Connection-oriented Protocol: Requires connection setup before communication. Example: TCP.
    - Connectionless Protocol: Data sent without ensuring the recipient is ready. Example: UDP.

## InetAddress
- provides methods to get the IP address of any hostname or to get the hostname of a given IP address
- can work with both IPv4 and IPv6 addresses and supports methods for unicast and multicast addresses