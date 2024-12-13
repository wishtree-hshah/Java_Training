package Map;
import java.util.*;

/**
 * Example to show all methods of map
 */
public class MapExample {
    public static void main(String[] args) {
        // Create a Map
        Map<String, Integer> map = new HashMap<>();

        // Add key-value pairs to the map
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Diana", 40);

        System.out.println("Map after adding elements: " + map);

        // Access a value by key
        System.out.println("Value associated with 'Bob': " + map.get("Bob"));

        // Check if a key or value exists
        System.out.println("Map contains key 'Alice': " + map.containsKey("Alice"));
        System.out.println("Map contains value 40: " + map.containsValue(40));

        // Remove an entry by key
        map.remove("Charlie");
        System.out.println("Map after removing 'Charlie': " + map);

        // Iterate through the map
        System.out.println("Iterating through the Map:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Get all keys and values
        System.out.println("Keys: " + map.keySet());
        System.out.println("Values: " + map.values());

        // Replace a value
        map.put("Bob", 32);
        System.out.println("Map after replacing Bob's value: " + map);

        // Clear the map
        map.clear();
        System.out.println("Map after clearing: " + map);

        // Check if the map is empty
        System.out.println("Is Map empty: " + map.isEmpty());
    }
}

