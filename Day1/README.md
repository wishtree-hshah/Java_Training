**Execution of Java Code:** At compile-time, Java source code or .java file is converted into bytecode or .class file. At runtime, JVM (Java Virtual Machine) will load the .class file and will convert it to machine code with the help of an interpreter. After compilation of method calls (using the Just-In-Time (JIT) compiler), JVM will execute the optimized code. So Java is both compiled as well as an interpreted language.
<br/>
<br/>
**Compile the Java File:** Compile the Hello.java file to produce the Hello.class file
```Java
javac Hello.java
```
**Create the JAR File:** 
```Java
jar --create --file Hello.jar Hello.class
```
**Execute the Program using jar file:**
```Java
java -cp Hello.jar Hello   
```

# How JVM Works:

### How we get ClassNotFoundException:
- Bootstrap class loader ----> Extension class loader ----> System/Application class loader
- Here JVM follows Deligation-Hierarchy principle to koad classes.
- It will start to find classes from Bootstrap to system then if the class isnot present in system class loader then we will get java.lang.ClassNotFoundException
- Path from where classes are found:
<br/>
    1. Bootstrap Class Loader: JAVA_HOME/lib
<br/>
    2. Extension Class Loader: JAVA_HOME/jre/lib/ext
<br/>
    3. System/Application Class Loader: application classpath, which is specified by the java.class.path environment variable

**How to get details of class created by JVM**
- To get runtime instance of class: c1.className()
- To get all methods of class: c1.getDeclaredMethods() / accessing method by method.getName() / Stores in array
- To get all fields of class: c1.getDeclaredFields() / accessing field by field.getName() / Stores in array

### JVM memory areas:
- Method Area: contains classname, immdiate parent classname, methods, variables, static variables<br/>
Only one method area per JVM / Shared resorce
- Heap Area: all objects/instances<br/>
Only one Heap area per JVM / Shared resorce
- Stack area: Every block call activation record / stack frame<br/>
Method calls and all local variable related to that method is stored in frame and will be destroyes after termination of thread.<br/>
Not a shared resource
- PC Registers: PC Registers: Stores the current instruction address for a thread.
Each thread has its own
- Native method stacks: It stores info the methods, variable of that method which is not declare in the same class by get declared in any other language we just use it.<br/>
eg: system.nanoTime()

### Execution Engine:

- Interpreter: interprets code line by line. Everytime method is called, reads bytecode of that method line by line dosent convert it into machine code at once so this is disadvantage and it slows our program if method call is frequent.
- Just-In-Time Compiler(JIT): to increase the efficiency of interpreter. compiles entire bytecode and convert into native code(the code which computer can understand) and stores it. This avoids re-interpreting the same code if method is called frequently
- Garbage Collector: Automatically manages memory by destroying objects that are no longer referenced or reachable so that memory leaks doesnot happens

Now What is unreachable object?

1. Setting references to null:
```Java
    MyClass obj1 = new MyClass(); // object created
    obj1 = null;                  // object is now unreachable
```
2. Going out of scope:
```Java
    public void someMethod() {
        MyClass obj1 = new MyClass();  // object created inside the method
    }  // obj1 goes out of scope when the method ends, making the object unreachable
```
3. Assigning references to another object:
```Java
    MyClass obj1 = new MyClass();
    MyClass obj2 = obj1;  // Now obj2 points to the same object as obj1
    obj1 = null;           // obj1 no longer points to the object, but obj2 still does
    // In this case, the object is still reachable via obj2.
```
4. Island of Isolation:
```Java
    ObjectA a = new ObjectA();
    ObjectB b = new ObjectB();

    a.setB(b);  
    b.setA(a); 
    a = null;
    b = null; 
```
- Now, objectA and objectB are no longer reachable by the main program. But they are still connected to each other, forming an island of isolation.

Ways to call GC manually: 

1. System.gc();
2. Runtime.getRuntime().gc();

### Finalization Method
- Before calling the GC, finalization method is called, it will perform cleanup activities like:

    1. close db connection
    2. closing file stream (eg. fileInputStream, fileOutputStream)
    3. releasing networks (eg. socket)
    4. releasing other external resource
    5. deregistering listerners

# JDK:

- to run only java program on system, only JRE is needed
- If any java based application is needed then JDK will provide some neccsary tools along with JRE
- JDK has private JVM
- JDK contains:
    - Java Runtime Environment (JRE),
    - An interpreter/loader (Java),
    - A compiler (javac),
    - An archiver (jar) and many more.

## How are Java objects stored in memory?
- when we allocate the object using new(), the object is allocated on Heap, otherwise on Stack if not global or static.

- There are two way to create an object:
    
    1. By String Literal: Here JVM is not bonded to create new memory
        ```Java
        //Here there is one string pool constant
        //str1 and str2 reference to same string pool
        String str1="GFG";
        String str2="GFG"
        ```
    2. By new keyword:JVM is bonded
        ```Java
        //Here both string get different
        //memory and stored in heap
        String str1=new String("GFG");
        String str2=new String("GFG");
        ```
## Stack:
- Automatic memory allotment and delallotment when the method exist
- Data stored in stack is available only when method is created is running
- contiguous block
- Faster memory allocation than heap
- But has limited space

## Heap:
- Every time when we make an instance it get stored in heap
- Heap Memory Allocation Categories:
    
    1. Young Generation: Stores newly created object. Object here first. Have short lifespan
    2. Old or Tenured Generation: This is the part of Heap-memory that contains the older data objects that are not in frequent use or not in use at all are placed.
    3. Permanent Generation: Contains JVM metadata, such as information about loaded classes, method definitions, and constant pools.

## Stack Frame Structure Contains:
- Local Variable Array (LVA):
    
    1. int : 1 block
    2. long : 2 block
    3. float : 1 block
    4. Double : 2 block
    5. Object : 1 block
    6. Byte : 1 block
- Operand Stack (OS):  It temporarily holds intermediate values and performs operations.
- Frame Data (FD): Contains method returns and exception table

## Basic Java Terminologies:
- Class: Blueprint of a plan
- Object: Instance of any class (eg. dog, cow belongs to animal class)
- Method: behavior of an object
- Instance Variable:associated with individual objects of a class and hold values specific to each instance

**Note:** When the class is public, the name of the file has to be the class name.

## Java Basic Syntax:
- comments 
- source file name
- case sensitivity
- classnames
- public static void main(String [] args): String[] args is the parameter that allows passing command-line arguments to the program.
- method names
- identifiers: constant are uppercase
- access modifiers: private, default, protected, public
- java keywords

## New Java Keywords
- assert: assert is used to check if a condition (predicate) is true at that point in the program.
If the condition is false, an AssertionError is thrown, and the optional message is printed.
- native: These methods are used to call native code from within Java applications
- strictfp: A Java keyword is used to restrict the precision and rounding of floating-point calculations to ensure portability.
- synchronized:  ensures that only one thread can execute these methods at any given time, preventing race conditions
- transient: The transient keyword is primarily used when you want to prevent a particular field from being serialized. This can be useful for sensitive information (like passwords) that should not be stored.