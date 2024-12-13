package Map;
import java.util.*;

/**
 * Example to show LikedHashMap methods
 */
public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        linkedHashMap.put("Alice", 25);
        linkedHashMap.put("Bob", 30);
        linkedHashMap.put("Charlie", 35);
        linkedHashMap.put("Diana", 40);

        System.out.println("LinkedHashMap after adding elements: " + linkedHashMap);

        // Access a value by key
        System.out.println("Value associated with 'Bob': " + linkedHashMap.get("Bob"));

        // Check if a key or value exists
        System.out.println("LinkedHashMap contains key 'Alice': " + linkedHashMap.containsKey("Alice"));
        System.out.println("LinkedHashMap contains value 40: " + linkedHashMap.containsValue(40));

        // Remove an entry by key
        linkedHashMap.remove("Charlie");
        System.out.println("LinkedHashMap after removing 'Charlie': " + linkedHashMap);

        // Iterate through the LinkedHashMap
        System.out.println("Iterating through the LinkedHashMap:");
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get all keys and values
        System.out.println("Keys: " + linkedHashMap.keySet());
        System.out.println("Values: " + linkedHashMap.values());

        // Replace a value
        linkedHashMap.put("Bob", 32);
        System.out.println("LinkedHashMap after replacing Bob's value: " + linkedHashMap);

        // Clear the LinkedHashMap
        linkedHashMap.clear();
        System.out.println("LinkedHashMap after clearing: " + linkedHashMap);

        // Check if the LinkedHashMap is empty
        System.out.println("Is LinkedHashMap empty: " + linkedHashMap.isEmpty());
    }
}
