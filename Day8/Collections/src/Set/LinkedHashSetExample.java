package Set;

import java.util.*;

/**
 * Showing basic methods for LinkedListHashSet
 */
public class LinkedHashSetExample {
    public static void main(String[] args) {
        // Creating a LinkedHashSet for String elements
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // 1. add() - Add elements to the set
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Cherry");
        linkedHashSet.add("Date");

        // 2. addAll() - Add multiple elements from another collection
        List<String> fruits = Arrays.asList("Elderberry", "Fig", "Grape");
        linkedHashSet.addAll(fruits);

        // 3. contains() - Check if an element exists
        System.out.println("Contains 'Banana': " + linkedHashSet.contains("Banana"));  // True
        System.out.println("Contains 'Mango': " + linkedHashSet.contains("Mango"));    // False

        // 4. remove() - Remove a specific element
        linkedHashSet.remove("Cherry");
        System.out.println("After removing 'Cherry': " + linkedHashSet);

        // 5. removeAll() - Remove all elements that are in another collection
        List<String> toRemove = Arrays.asList("Apple", "Date");
        linkedHashSet.removeAll(toRemove);
        System.out.println("After removing 'Apple' and 'Date': " + linkedHashSet);

        // 6. size() - Get the size of the set
        System.out.println("Size of the set: " + linkedHashSet.size());

        // 7. isEmpty() - Check if the set is empty
        System.out.println("Is the set empty? " + linkedHashSet.isEmpty());

        // 8. clear() - Remove all elements from the set
        linkedHashSet.clear();
        System.out.println("After clearing the set: " + linkedHashSet);

        // 9. add() again after clear
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Lemon");

        // 10. forEach() - Iterate through elements
        System.out.print("Iterating through elements: ");
        linkedHashSet.forEach(fruit -> System.out.print(fruit + " "));

        // 11. toArray() - Convert to array
        Object[] array = linkedHashSet.toArray();
        System.out.println("\nArray: " + Arrays.toString(array));

        // 12. containsAll() - Check if all elements of another collection are in the set
        List<String> checkList = Arrays.asList("Kiwi", "Lemon");
        System.out.println("Contains all elements in checkList? " + linkedHashSet.containsAll(checkList));

        // 13. clone() - Create a shallow copy of the set
        LinkedHashSet<String> clonedSet = (LinkedHashSet<String>) linkedHashSet.clone();
        System.out.println("Cloned Set: " + clonedSet);

        // 14. toString() - Get the string representation of the set
        System.out.println("String representation: " + linkedHashSet.toString());
    }
}

