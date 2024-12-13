package List;

import java.util.LinkedList;

/**
 * Class to show all key methods of linked list
 */
public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango"); // Add at the beginning
        list.addLast("Orange"); // Add at the end
        System.out.println("LinkedList after adding elements: " + list);

        // Updating elements
        list.set(2, "Grapes");
        System.out.println("After updating 2nd index: " + list);

        // Removing elements
        list.remove("Banana"); // Remove specific element
        list.removeFirst(); // Remove first element
        list.removeLast(); // Remove last element
        System.out.println("After removing elements: " + list);

        // Iterating over elements
        System.out.println("Iterating over LinkedList:");
        for (String item : list) {
            System.out.println(item);
        }

        // Convert to array
        String[] array = list.toArray(new String[0]);
        System.out.println("Converted to Array: " + java.util.Arrays.toString(array));

        // Size of the LinkedList
        System.out.println("Size of LinkedList: " + list.size());
    }
}
