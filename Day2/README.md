## New Java Keywords
- assert: assert is used to check if a condition (predicate) is true at that point in the program.
If the condition is false, an AssertionError is thrown, and the optional message is printed.
- native: These methods are used to call native code from within Java applications
- strictfp: A Java keyword is used to restrict the precision and rounding of floating-point calculations to ensure portability.
- synchronized:  ensures that only one thread can execute these methods at any given time, preventing race conditions
(Here we have Synchronized method as well as block)
    ```Java
        public void increment() {
            // Critical section - only one thread can access this block at a time
            synchronized (this) {
                count++;
            }
        }

        // Synchronized method to ensure only one thread modifies the count at a time
        public synchronized void increment() {
            count++;
        }
    ```
- transient: The transient keyword is primarily used when you want to prevent a particular field from being serialized. This can be useful for sensitive information (like passwords) that should not be stored.
- sealed: provides a way to restrict inheritance and enforce a controlled class hierarchy, improving maintainability and safety.
- permits: used alongside sealed to specify exactly which classes can extend the sealed class.

## Types of Java Variables:

- Local Variables
- Instance Variables
- Static Variables

## Operators in Java:
- Arithmetic Operators:

    1. *: Multiplication
    2. /: Division
    3. %: Modulo
    4. +: Addition
    5. –: Subtraction
- Unary Operators:
    
    1. Unary minus
    2. Unary plus
    3. Increment operator
    4. Decrement operator
    5. Logical not operator
- Assignment Operator
- Relational Operators
- Logical Operators
- Ternary Operator
- Bitwise Operators
- Shift Operators
- instance of operator

## Methods to take input from user:
- BufferedReader Class
- Scanner Class: we don’t have to write throws as there is no exception thrown by it
- BuffereredReader reads only stream of characters so it is much faster than scanner as it takes nextInt(), nextFloat().
- BufferedReader: Use when speed and large input handling are critical.
- Scanner: Use for smaller or user-interactive inputs where ease of use is important.

**if:** Executes a block of code only when the given condition is true. If the condition is false, the code block is skipped.

**if-else:** Adds an alternative block (else) that executes when the if condition is false.

**if-else-if Ladder:** Evaluates multiple conditions sequentially. When a true condition is found, its corresponding block is executed, and the rest of the ladder is skipped. Ends with an else block (optional) to handle cases where none of the conditions are true.

**switch:** decision-making based on a single value.It matches the value against multiple case labels and executes the matching block. A break stops further execution, while the default block handles unmatched cases.

Fall through: Without break, the switch continues execution from the matched case down to subsequent cases until it encounters a break or reaches the end.

## for Loop:
divided into various parts:

1. Initialization Expression
2. Test Expression
3. Update Expression

## for-each Loop: 
iteration over arrays and collections. Access elements directly without using index. Used only when we want to access elemnts sequentially

Limitations:

- Cannot Modify Array Elements Directly:
    ```Java
    for (int num : marks)  {     
    // only changes num, not the array element     
    num = num*2;  
    }
    ```
    gives copy of element not the reference so can't modify it directly.
- Doen't give index: if we somehow want to acess the index of element then traditional loop is more preffered.
- Iteration is only in forward direction not in reverse.
- performance of large collection is worse.

## while Loop:
execute the block of stmts repeatedly until the give condition is false.

## do-while Loop:
executes atleast one time weather the condition is true or not then checks the condition and if the condtition is true repeats that block execution.

## break:
it is used to terminate the loop. When the break is encountered then the loop iteration stops and the immendiate after the loop executes.

## continue:
when the continue is encountered then the control goes to next iteration instead of continuing the current iteration.