import java.util.*;

public class HashtableExample {
    public static void main(String[] args) {
        // Creating a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Adding elements using put()
        hashtable.put("One", 1);
        hashtable.put("Two", 2);
        hashtable.put("Three", 3);
        hashtable.put("Four", 4);

        // Displaying the Hashtable
        System.out.println("Hashtable: " + hashtable);

        // Get the value for a specific key using get()
        System.out.println("Value for key 'Two': " + hashtable.get("Two"));

        // Check if a key exists using containsKey()
        System.out.println("Contains key 'Three': " + hashtable.containsKey("Three"));

        // Check if a value exists using containsValue()
        System.out.println("Contains value 4: " + hashtable.containsValue(4));

        // Remove a key-value pair using remove()
        hashtable.remove("Four");
        System.out.println("After removing key 'Four': " + hashtable);

        // Get the size of the Hashtable
        System.out.println("Size of Hashtable: " + hashtable.size());

        // Check if the Hashtable is empty (clear all elements)
        hashtable.clear();
        System.out.println("After clearing: " + hashtable);
        System.out.println("Is Hashtable empty: " + hashtable.isEmpty());

        // Adding elements again to demonstrate other methods
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        hashtable.put("Cherry", 3);

        // Get all keys using keys()
        Enumeration<String> keys = hashtable.keys();
        System.out.print("Keys: ");
        while (keys.hasMoreElements()) {
            System.out.print(keys.nextElement() + " ");
        }
        System.out.println();

        // Get all values using values()
        Enumeration<Integer> values = hashtable.elements();
        System.out.print("Values: ");
        while (values.hasMoreElements()) {
            System.out.print(values.nextElement() + " ");
        }
        System.out.println();
    }
}
