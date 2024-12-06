**Externalizable:**
used in place of transient keyword. Override method writeExternal and readExternal then dont read or write that variable that we want to hide

**System.in:** when we write system.in inside scanner it will tell scanner to read input from keyboard.

## Java Methods:
- It is a collection of statements that may take or may not take any arguments and may or may not return any value.
- Advantages: code resuablity, optimization
- Method Declaration:

    1. Modifier: public, protected, private, default (optional)
    2. return type: data type that is returned by method or void should be written if nothing is returned (mandatory).
    3. Method Name: camelCase
    4. Parameter List: it is seperated by commas (optional), it no parameters then empty parentheses.
    5. Exception list: Exceptions that your method can throw. If it is written here then no need to handle that exception inside the try catch block in method.
    6. Method Body: Block of stmts that will be executed.

- Types of Method:

    1. Predefined Method: Built in java class libraries (e.g. Arrays.sort(), scanner.nextInt(), str.toUpperCase())
    2. User-defined Method: defined by user as per requirement
    3. Abstract Methods: contains only defination not the body.
    4. static methods: accessible without any instance. can't be overridden as they are bound to the class at compile-time not to instance at run-time

- Ways to Create Method in Java:

    1. Instance Method: can be called by object name.
    2. Static Method: can be called by classname.

- When method stops excuting:
    
    1. completes all stmts in block
    2. reaches return stmt
    3. throws an exception

- Passing parameters to method:

    1. Passing Array as an Argument: when more number of parameter of same datatype needs to be passed.
    2. Passing Variable-arguments as an Argument
    3. Method Overloading.

- Memory Alloaction for method calls: when method is called stack frame is created. The arguments and returns are stored in stack frames

## Command-Line Arguments:
- we can pass both string and other primitive data types as CLA. This CLA is passes to JVM then JVM wraps and supplies it to args[]. Seperated by space.
- Cmd: java Hello Hey 9
- args[0]: Hey
- args[1]: 9

## Variable Arguments:
```Java
//can be called with zero or more parameters
public static void fun(int ... a) 
{
    // method body
} 
```
- Erroneous Varargs Examples
    1. Case 1: Specifying two Varargs in a single method
    2. Specifying Varargs as the first parameter of the method instead of the last one:

## Arrays:
- Arrays are useful when you need to store a large number of similar items and access them by their index.
- Declaration
- Instantiation
- Initialization
- Accessing Elements
- Length of an Array
- Two types of array:
    
    1. Single Dimensional
    2. Multi Dimensional
- cloning an array .clone(): this will create a shallow copy not a reference. so changing shallow copy doesn't change original data
- Advanced Initialization Using Streams:

    1. Using IntStream.range()
    2. Using IntStream.rangeClosed()
    3. Using IntStream.of()
- Jagged Array
- final array: this meansreference of array can't be changes while the elements still remains mutable.
```Java
final arr1[];
arr2;
arr1 = arr2; //compile time error
```
## String:
- ways to create string:
    
    1. string literal
    2. new keyword

- CharBuffer: it implements CharSequence interface. it is used for mutable sequence of character where we need more i/o operations

- CharSequence interface include:
    
    - some common methods: substring, charAt, length, toString, indexOf that can be implemented by:

    1. String: 
        - Immutable
        - Methods like toUpperCase or concat return a new object without modifying the original string.
        - thread-safe
    2. StringBuffer:
        - mutable
        - Thread-safe but maked overhead
    3. StringBuilder:
        - Mutable
        - Not thread-safe
- StringTokenizer:
    - Used to split a string into tokens based on delimiters.
    - Maintains an internal pointer to track the current position in the string.
- StringJoiner:
    - Creates a sequence of strings separated by a specified delimiter, with optional prefixes and suffixes.
- String gives NullPointerException while concating if any one string is null.

## Interface:
- it does not provide implementation of the methods. The class that implements that interface will provide implementation.
- the class implement that interface should compulsary implement that method.
- in java multiple inheritance is not possible but with interface we can achieve it.
- we can instantiate it
- Functional Interface:
    -  can have only abstract method
    - @FunctinalInterface: for only one abstract method or give compile-time error
    - Lambda expression: to implement abstract method
- In-built functional interface:
    1. Consumer ---> Bi-Consumer: consumer interface takes only one argument, while Bi-Consumer interface takes two arguments. 
    used for printing or iterating the entries in map as returns void
    2. Predicate ---> Bi-Predicate: Test a condition and filters
    3. Function ---> Bi-function: Takes one argument, processes it, and returns a result.
    4. UninarOperator ---> BinaryOperator: Take a arg and return result of same data type
    5. Supplier: Takes no arguments, generates or supplies a result.
    - Real life example:
        
        1. Consumer: Sending emails to a list of customers.
        2. Predicate: Filtering a list of employees based on their age for retirement eligibility.
        3. Function: Converting product prices from USD to INR.
        4. Supplier: Generating random order numbers for new orders in an e-commerce system.