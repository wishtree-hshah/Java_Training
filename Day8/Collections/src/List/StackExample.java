package List;

import java.util.*;

/**
 * Example to show all key methods of stack class
 */
public class StackExample {
    /**
     * Method to demonstrate push operation
     * @param stack
     */
    static void stackPush(Stack<Integer> stack) {
        for (int i = 0; i < 5; i++) {
            stack.push(i);
        }
        System.out.println("Stack after push operation: " + stack);
    }

    /**
     * Method to demonstrate pop operation
     * @param stack
     */
    static void stackPop(Stack<Integer> stack) {
        System.out.println("Pop Operation:");
        while (!stack.isEmpty()) {
            Integer element = stack.pop();
            System.out.println("Popped: " + element);
        }
    }

    /**
     * Method to demonstrate peek operation
     * @param stack
     */
    static void stackPeek(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            Integer element = stack.peek();
            System.out.println("Element on top of stack: " + element);
        } else {
            System.out.println("Stack is empty");
        }
    }

    /**
     * Method to demonstrate search operation
     * @param stack
     * @param element
     */
    static void stackSearch(Stack<Integer> stack, int element) {
        Integer position = stack.search(element);
        if (position == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element " + element + " is at position: " + position);
        }
    }

    /**
     * Method to demonstrate empty operation
     * @param stack
     */
    static void stackEmpty(Stack<Integer> stack) {
        System.out.println("Is stack empty? " + stack.isEmpty());
    }

    /**
     * Method to demonstrate size operation
     * @param stack
     */
    static void stackSize(Stack<Integer> stack) {
        System.out.println("Size of the stack: " + stack.size());
    }

    public static void main(String[] args) {
        // Create a stack
        Stack<Integer> stack = new Stack<>();

        // Perform stack operations
        stackPush(stack);
        stackPeek(stack);
        stackSearch(stack, 3);  // Search for element 3
        stackSearch(stack, 6);  // Search for element 6 (not in stack)
        stackPop(stack);  // Pop elements from stack
        stackSize(stack);  // Display stack size
        stackEmpty(stack);  // Check if stack is empty
    }
}
