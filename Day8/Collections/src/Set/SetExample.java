package Set;

import java.util.*;

/**
 * Showing basic methods for Set
 */
public class SetExample {

    public static void main(String args[]) {
        // Creating a HashSet of String type
        Set<String> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");
        set.add("Elderberry");

        System.out.println("Initial Set: " + set);

        // Adding a duplicate element (won't be added)
        set.add("Apple");
        System.out.println("Set after adding duplicate element 'Apple': " + set);

        // Removing an element
        set.remove("Banana");
        System.out.println("Set after removing 'Banana': " + set);

        // Checking if an element exists
        boolean containsCherry = set.contains("Cherry");
        System.out.println("Does the set contain 'Cherry'? " + containsCherry);

        // Checking if the set is empty
        boolean isEmpty = set.isEmpty();
        System.out.println("Is the set empty? " + isEmpty);

        // Getting the size of the set
        int size = set.size();
        System.out.println("Size of the set: " + size);

        // Clearing all elements from the set
        set.clear();
        System.out.println("Set after clearing all elements: " + set);

        // Adding elements again for further operations
        set.add("Fig");
        set.add("Grape");
        set.add("Honeydew");

        // Iterating through the set using for-each loop
        System.out.println("Iterating through the set:");
        for (String fruit : set) {
            System.out.println(fruit);
        }

        // Adding more elements to demonstrate Union and Intersection
        Set<String> anotherSet = new HashSet<String>();
        anotherSet.add("Grape");
        anotherSet.add("Honeydew");
        anotherSet.add("Jackfruit");

        // Union of two sets
        Set<String> unionSet = new HashSet<String>(set);
        unionSet.addAll(anotherSet);
        System.out.println("Union of the two sets: " + unionSet);

        // Intersection of two sets
        Set<String> intersectionSet = new HashSet<String>(set);
        intersectionSet.retainAll(anotherSet);
        System.out.println("Intersection of the two sets: " + intersectionSet);

        // Difference of two sets (elements in the first set but not in the second)
        Set<String> differenceSet = new HashSet<String>(set);
        differenceSet.removeAll(anotherSet);
        System.out.println("Difference of the two sets: " + differenceSet);
    }
}
