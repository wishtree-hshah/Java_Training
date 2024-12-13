# Java Collections

## Java List Interface:
- The List Interface in Java extends the Collection Interface
- Order is maintained
- Allows duplicates
- implementation: ArrayList, LinkedList, Stack, Vector
- ListIterator: traverse in forrward and backward direction
- implementation classes of the List interface are ArrayList, LinkedList, Stack, and Vector.

## 1. Arraylist:
- provides the functionality of a dynamic array where the size is not fixed as an array.
- ArrayList(class) --implements--> List(interface) --extends--> Collection(interface)
- we can't use primitive data types we have to use wrapper class (converts primitive data to objects)
- some disadvantages:
    - Slower than arrays
    - Increased memory usage
    - Not thread-safe
- when to use: frequent access of elements by index
- use case:
    - A list of products in an e-commerce application where most of the operations are retrievals by index.
    - music streaming like spotify: store and managae playlist where user can quickly access songs by index

## 2. Vector Class:
- IllegalArgumentException: if the InitialSize of the vector defined is negative.
- If the specified collection is null, It throws NullPointerException. 
- Similar to ArrayList, but with synchronized methods for thread-safety

## 3. LinkedList: 
- elements are not stored in contiguous locations
- when to use: Frequent insertions or deletions at both end
- use case: 
    - netflix: it maintains recently watched movies or shows at front of list and least recent content is removed for efficient history managment

## 4. Stack Class:
- last-in, first-out (LIFO) stack data structure
- It extends the Vector class 
- push(E item): Adds an item to the top of the stack.
- pop(): Removes and returns the top element of the stack. Throws EmptyStackException if the stack is empty.
- peek(): Returns the top element without removing it. Throws EmptyStackException if the stack is empty.
- empty(): Returns true if the stack is empty, otherwise false.
- search(Object o): Returns the position of the element from the top of the stack (1-based index). Returns -1 if not found.
- Use case:
    - undo-redo operations
    - back button in browsers like Chrome relies on a stack

## Set Interface
- do not store duplicates
- No Specific Order
- Implementation Classes: HashSet , LinkedHashSet and TreeSet.

## 1. HashSet
- when to use: When uniqueness is needed, and order doesn’t matter.
- use case:
    - on instagram like social media each username is uniquely assigned

## 2. TreeSet:
- Sorted Order
- When uniqueness and sorted order are needed (natural or custom order).
- use case: 
    - airbnb: it stores unique eg flat in any city and we can also filter it

## 3. LinkedHashSet:
- Maintains the insertion order of elements
- When uniqueness is needed and order of insertion must be preserved.
- use case:
    - storing connection in social media where uniqueness and order is also imp

## Difference between Queue and PriorityQueue:
- Oueue: 
    - Elements are processed in the FIFO (First In, First Out)
    - Allows duplicates
    - implementation: LinkedList or ArrayDeque
    - use case:
        - Food Delivery Apps (e.g., Swiggy, Zomato): Orders are queued, and delivery agents pick them up in the order they were received.
- PriorityQueue:
    - Elements are processed based on their priority, not insertion order
    - Allows duplicates
    - Binary heap internally
    - use case: 
        - E-commerce Platforms (e.g., Amazon, Flipkart): Priority-based order processing, such as prioritizing Prime users or high-value customers.

## Deque:
- Stack Operations: Use addFirst() and removeFirst().
- Queue Operations: Use addLast() and removeFirst().
- Double-Ended Queue: Perform insertions/removals at both ends.
- use case: 
    - Social Media Stories (e.g., Instagram, Snapchat): Users can swipe left or right to navigate through a deque of stories.

## Map
- A general interface in Java to store key-value pairs.
- A key uniquely identifies a value.
- No duplicate keys are allowed, but values can be duplicated.

## 1. HashMap:
- No guarantee of order for stored keys or values.
- use case:
    - E-commerce Platforms (e.g., Amazon, Flipkart):
Used for storing and quickly retrieving product details by unique IDs.

## 2. LinkedHashMap
- maintains the insertion order or access order of keys
- use case:
    - Cache in Web Browsers (e.g., Chrome, Firefox):
Browsers use a LinkedHashMap to maintain a cache of recently visited pages
    - key: url
    - value: content of page


# Generics:
- Generics allow you to create classes, methods, and interfaces that work with different types (like Integer, String, etc.) without needing to rewrite the code for each type.
- Why Use Generics?
    - Type Safety: Ensures you only use the correct type, avoiding errors like ClassCastException.
    - Reusability: Write code that can work with any data type.
    - Better Readability: Makes code clearer without needing type casting.
- Types of Generics in Java
    1. Generic Method: A method that can work with different types. The type is specified when calling the method.
    2. Generic Class: class that can work with any data type, allowing you to define a class with a type parameter
- some use cases:
    - E-commerence application: A ShoppingCart class could be generic, allowing it to handle various types of products (e.g., Electronics, Clothing, etc.).
    - Social media: A Post class could be designed to manage various post types like images, video