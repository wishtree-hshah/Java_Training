package Queue;
import java.util.*;

/**
 * Showing basic methods for PriorityQueue
 */
public class PriorityQueueExample {
    public static void main(String[] args) {
        // Create a PriorityQueue
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        // Add elements to the priority queue
        priorityQueue.add(40); // Throws exception if fails
        priorityQueue.offer(20); // Returns false if fails
        priorityQueue.add(30);
        priorityQueue.add(10);

        System.out.println("PriorityQueue after adding elements: " + priorityQueue);

        // Access the head of the queue
        System.out.println("Head element (peek): " + priorityQueue.peek()); // Returns null if empty
        System.out.println("Head element (element): " + priorityQueue.element()); // Throws exception if empty

        // Remove elements from the priority queue
        System.out.println("Removed element (poll): " + priorityQueue.poll()); // Returns null if empty
        System.out.println("PriorityQueue after poll: " + priorityQueue);

        System.out.println("Removed element (remove): " + priorityQueue.remove()); // Throws exception if empty
        System.out.println("PriorityQueue after remove: " + priorityQueue);

        // Add more elements
        priorityQueue.offer(50);
        priorityQueue.offer(60);
        priorityQueue.offer(70);

        // Iterate through the priority queue
        System.out.println("Iterating through the PriorityQueue:");
        for (Integer num : priorityQueue) {
            System.out.println(num);
        }

        // Check if the priority queue contains an element
        System.out.println("PriorityQueue contains 60: " + priorityQueue.contains(60));

        // Convert to an array
        Object[] array = priorityQueue.toArray();
        System.out.println("PriorityQueue as an array: " + Arrays.toString(array));

        // Clear the priority queue
        priorityQueue.clear();
        System.out.println("PriorityQueue after clearing: " + priorityQueue);

        // Check if the priority queue is empty
        System.out.println("Is PriorityQueue empty: " + priorityQueue.isEmpty());

        // Add elements with a custom comparator (max heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        maxHeap.add(40);
        maxHeap.add(20);
        maxHeap.add(30);
        maxHeap.add(10);

        System.out.println("PriorityQueue (Max Heap) after adding elements: " + maxHeap);
    }
}