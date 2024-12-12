## Netwoking

- UDP: data packets (datagrams) are sent without establishing a connection.
- Message-oriented. Data is sent in discrete packets (datagrams), which may arrive out of order or not at all.

## OOPS Concepts:

## Classes and Objects:
- classes can't occupy memory
- ways to create object of class:
    1. Using new keyword
    ```Java
    Test t = new Test();
    ```
    2. Using Class.forName(String className) method:
    ```Java
    Test obj = (Test)Class.forName("com.p1.Test").newInstance();
    ```
    3. Using clone() method:
    ```Java
    Test t1 = new Test();
    // creating clone of above object
    Test t2 = (Test)t1.clone();
    ```
- In the inheritance system, we use a parent class reference variable to store a sub-class object.

## Constructors and Destructors:

- Types:
    - Default Constructor
    - Parameterized Constructor
    - Copy Constructor: to create a new object as a copy of an existing object
    - example: undo and redo, data structure tree: to duplicate a node or subtree.

## Abstraction:
- process of hiding the complex implementation and showing only necessay details.
- Abstraction can be achieved using:
    1. Abstract Classes
    2. Interfaces
- example: in atm we only insert card, enter pin, and withdraw cash but the internal process is not known.

## Encapsulation:
- The process of bundling data (variables) and methods (functions) that operate on the data into a single unit called a class.
- The ShoppingCart class encapsulates all the details, exposing simple methods like addItem() and checkout().

## Inheritance:
- A mechanism where one class (child/subclass) acquires the properties and behaviors of another class (parent/superclass).
- PaymentMethod is parent class and CreditCard, DebitCard, UPI, and NetBanking as child class

## Polymorphism:
 - The ability of different classes to be treated as instances of the same class through inheritance, but allowing for different implementations of methods.
- Compile-time Polymorphism:
    - Method Overloading
- Runtime Polymorphism
    - overriding
- Different vehicle types (Car, Bike, Auto) implement a calculateFare() method differently based on vehicle type in ola/uber

## Solid Principles:

1. Single Responsibility Principle:
- The Single Responsibility Principle states that a class should have only one reason to change, meaning it should focus on a single responsibility.

2. Open/Closed Principle:
- Open for Extension: New functionality should be added by extending the behavior of a class without changing the existing code.
- Closed for Modification: Existing code should not need modification when requirements change or new features are added.

3. Liskov Substitution Principle:
- If you have a subclass, you should be able to replace the parent class with the subclass without breaking the code.

4. Interface Segregation Principle:
- A class should not be forced to implement methods it does not need. Instead of one large interface, create smaller, specific ones.

5. Dependency Inversion Principle:
- High-level modules should not depend on low-level modules. Both should depend on abstractions (interfaces). Abstractions should not depend on details, and details should depend on abstractions.