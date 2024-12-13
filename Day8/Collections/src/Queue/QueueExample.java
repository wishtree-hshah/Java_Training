package Queue;
import java.util.*;

/**
 * Showing basic methods for Queue
 */
public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue of Strings
        Queue<String> queue = new LinkedList<>(); // Using LinkedList as the implementation of Queue

        // Add elements to the queue using add() and offer()
        queue.add("apple");
        queue.offer("banana");
        queue.add("cherry");
        queue.offer("date");

        // Display the queue
        System.out.println("Queue after adding elements: " + queue);

        // Peek at the element at the front of the queue using peek()
        String front = queue.peek();
        System.out.println("Element at the front (peek): " + front);

        // Remove elements from the front using remove() and poll()
        String removedElement = queue.remove();
        System.out.println("Removed element using remove(): " + removedElement);

        //Removes and returns the element at the front of the queue
        String polledElement = queue.poll();
        System.out.println("Polled element using poll(): " + polledElement);

        // Display the updated queue
        System.out.println("Queue after removal and polling: " + queue);

        // View the element at the front without removing using element()
        String head = queue.element();
        System.out.println("Head of the queue using element(): " + head);

        // Check the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);

        // Iterate through the queue using iterator
        System.out.println("Iterating through the queue:");
        Iterator<String> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }
}
