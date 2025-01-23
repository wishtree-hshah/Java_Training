### 1. **DRY (Don’t Repeat Yourself)**

**Explanation**:  
Instead of repeating the same logic in multiple places, encapsulate it in a function or a reusable piece of code.

Without DRY:
```python
# Repeating the same logic in multiple places
print("Circle Area:", 3.14 * 5 * 5)
print("Circle Area:", 3.14 * 7 * 7)
print("Circle Area:", 3.14 * 9 * 9)
```

With DRY:
```python
# Reusable function for calculating circle area
def circle_area(radius):
    return 3.14 * radius * radius

print("Circle Area:", circle_area(5))
print("Circle Area:", circle_area(7))
print("Circle Area:", circle_area(9))
```

---

### 2. **KISS (Keep It Simple, Stupid)**

**Explanation**:  
Avoid overcomplicating logic and keep the solution straightforward.

Without KISS:
```python
# Overcomplicated logic for checking if a number is positive
if number > 0:
    if number == 1 or number > 1:
        print("Positive")
    else:
        print("Not Positive")
```

With KISS:
```python
# Simple and clear logic for checking if a number is positive
if number > 0:
    print("Positive")
else:
    print("Not Positive")
```

---

### 3. **YAGNI (You Aren’t Gonna Need It)**

**Explanation**:  
Don’t implement functionality that isn’t required yet.

Without YAGNI:
```python
# Adding sorting logic unnecessarily before it’s needed
def add_item(item, items):
    items.append(item)
    items.sort()  # Sorting not required yet
    return items
```

With YAGNI:
```python
# Only implements adding an item
def add_item(item, items):
    items.append(item)
    return items
```

---
## Structural Design Patterns

- Structural design patterns focus on organizing and simplifying relationships between objects and classes. 
- They ensure that components of a system are structured in a way that enhances flexibility, efficiency, and maintainability by dealing with object composition and inheritance.
- These patterns are widely used to build scalable and reusable systems by bridging incompatible interfaces, adding functionality to objects dynamically, or managing object hierarchies effectively.

---

### **1. Adapter Design Pattern**
**Why Use**:  
- To bridge the gap between two incompatible interfaces, allowing them to work together seamlessly.
- Useful for integrating third-party or legacy systems with modern applications.

**Benefits**:  
- Enables reusability of existing functionality with minimal changes.
- Decouples client code from implementation-specific details.

**What We Can Achieve**:  
- Smooth integration of systems with mismatched interfaces.
- Flexibility in handling future changes in dependencies.

---

### **2. Composite Design Pattern**
**Why Use**:  
- To represent part-whole hierarchies where individual objects and compositions of objects are treated uniformly.
- Ideal for systems with tree-like structures.

**Benefits**:  
- Simplifies code by allowing uniform treatment of leaf nodes and composite structures.
- Makes it easy to add new types of components.

**What We Can Achieve**:  
- Structured representation of hierarchical systems (e.g., file systems, organizational charts).
- Simplified operations across entire structures.

---

### **3. Proxy Design Pattern**
**Why Use**:  
- To control access to an object by providing a placeholder or surrogate for it.
- Useful for managing resource-intensive objects, adding security, or implementing lazy initialization.

**Benefits**:  
- Adds a layer of abstraction to control or enhance object access.
- Reduces resource usage by delaying object creation or initialization.

**What We Can Achieve**:  
- Secure access to sensitive resources.
- Efficient resource management (e.g., virtual proxies for heavy objects).

--- 

### **Behavioral Design Patterns**  
Behavioral design patterns focus on how objects interact and communicate with each other. These patterns simplify complex control flows by defining clear protocols for collaboration.

---

### **1. Observer Design Pattern**

#### **Why Use**  
- When multiple objects need to be notified automatically of changes in the state of another object.

#### **Benefits**  
- Decouples the subject (the one being observed) and observers (subscribers).
- Automatically updates observers when the subject changes.

#### **What We Can Achieve**  
- A publish-subscribe system, where changes in one object are efficiently communicated to all interested objects.

#### **Example**  
In a stock market application, users subscribe to stock updates. When stock prices change, all subscribers are notified.

---

### **2. Strategy Design Pattern**

#### **Why Use**  
- To define a family of algorithms and make them interchangeable at runtime.

#### **Benefits**  
- Allows dynamic selection of algorithms.
- Reduces complex conditional statements.

#### **What We Can Achieve**  
- Clean separation between different algorithms and their execution.

#### **Example**  
A payment system that supports multiple payment methods (credit card, PayPal, etc.) and allows switching at runtime.

---

### **3. Command Design Pattern**

#### **Why Use**  
- To encapsulate a request as an object, allowing flexible request handling.

#### **Benefits**  
- Decouples the sender of a request from its receiver.
- Supports undo/redo functionality.

#### **What We Can Achieve**  
- A queue or log of executed commands, enabling undo operations.

#### **Example**  
A text editor where every action (cut, copy, paste) is treated as a command and can be undone or redone.

---
