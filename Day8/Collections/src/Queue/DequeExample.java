package Queue;
import java.util.*;

/**
 * Example to show methods for deque
 */
public class DequeExample {
    public static void main(String[] args) {
        // Create a Deque using LinkedList
        Deque<Integer> deque = new LinkedList<>();

        // Add elements to the deque
        deque.addFirst(10); // Adds to the front
        deque.addLast(20);  // Adds to the end
        deque.offerFirst(30); // Adds to the front, returns false if fails
        deque.offerLast(40);  // Adds to the end, returns false if fails

        System.out.println("Deque after adding elements: " + deque);

        // Access elements
        System.out.println("First element (peekFirst): " + deque.peekFirst()); // Returns null if empty
        System.out.println("Last element (peekLast): " + deque.peekLast());   // Returns null if empty

        // Remove elements
        System.out.println("Removed first element (pollFirst): " + deque.pollFirst()); // Returns null if empty
        System.out.println("Removed last element (pollLast): " + deque.pollLast());   // Returns null if empty

        System.out.println("Deque after removals: " + deque);

        // Add elements again
        deque.addFirst(50);
        deque.addLast(60);
        deque.addFirst(70);

        // Iterate through the deque
        System.out.println("Iterating through the Deque:");
        for (Integer num : deque) {
            System.out.println(num);
        }

        // Check if the deque contains an element
        System.out.println("Deque contains 60: " + deque.contains(60));

        // Convert to an array
        Object[] array = deque.toArray();
        System.out.println("Deque as an array: " + Arrays.toString(array));

        // Clear the deque
        deque.clear();
        System.out.println("Deque after clearing: " + deque);

        // Check if the deque is empty
        System.out.println("Is Deque empty: " + deque.isEmpty());
    }
}

