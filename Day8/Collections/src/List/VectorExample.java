package List;

import java.util.*;

/**
 * example to show all key methods of vector
 */
public class VectorExample {
    public static void main(String[] args) {
        // Creating a Vector using default constructor
        Vector<String> vector = new Vector<>();

        // Adding elements
        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");

        // Adding element at a specific index
        vector.add(1, "Orange");

        // Displaying the vector
        System.out.println("Vector: " + vector);

        // Accessing an element
        System.out.println("Element at index 2: " + vector.get(2));

        // Checking size and capacity
        System.out.println("Size: " + vector.size());
        System.out.println("Capacity: " + vector.capacity());

        // Checking if it contains a specific element
        System.out.println("Contains 'Apple': " + vector.contains("Apple"));

        // Removing an element
        vector.remove("Banana");
        System.out.println("After removing 'Banana': " + vector);

        // Removing an element by index
        vector.remove(1);
        System.out.println("After removing element at index 1: " + vector);

        // Iterating over the Vector
        System.out.println("Iterating over Vector:");
        for (String item : vector) {
            System.out.println(item);
        }

        // Adding multiple elements using addAll
        List<String> newItems = List.of("Grape", "Mango", "Pineapple");
        vector.addAll(newItems);
        System.out.println("After addAll: " + vector);

        // Sorting the vector
        Collections.sort(vector);
        System.out.println("After sorting: " + vector);

        // Clearing all elements
        vector.clear();
        System.out.println("After clearing: " + vector);

        // Checking if empty
        System.out.println("Is vector empty? " + vector.isEmpty());
    }
}
