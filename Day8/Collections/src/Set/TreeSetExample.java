package Set;

import java.util.*;

/**
 * Showing basic methods for TreeSet
 */
public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet of Integer
        TreeSet<Integer> treeSet = new TreeSet<>();

        // 1. Adding elements
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(5);
        treeSet.add(15);
        treeSet.add(25);

        // 2. Accessing elements
        System.out.println("First Element: " + treeSet.first());
        System.out.println("Last Element: " + treeSet.last());
        System.out.println("Contains 20? " + treeSet.contains(20));
        System.out.println("Higher than 15: " + treeSet.higher(15));
        System.out.println("Lower than 20: " + treeSet.lower(20));

        // 3. Removing elements
        treeSet.remove(10);
        System.out.println("After Removing 10: " + treeSet);
        treeSet.pollFirst();  // Removes the first element
        System.out.println("After Polling First: " + treeSet);
        treeSet.pollLast();  // Removes the last element
        System.out.println("After Polling Last: " + treeSet);

        // 4. Iterating through the TreeSet
        System.out.print("TreeSet Elements: ");
        for (Integer element : treeSet) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 5. Using subset methods
        //elements between 15 and 30
        System.out.println("Subset [15, 30]: " + treeSet.subSet(15, 30));
        //elements <20
        System.out.println("HeadSet [20]: " + treeSet.headSet(20));
        //elements >=20
        System.out.println("TailSet [20]: " + treeSet.tailSet(20));

        // 6. NavigableSet methods
        System.out.println("Descending Set: " + treeSet.descendingSet());

        // 7. Clear all elements
        treeSet.clear();
        System.out.println("After Clearing TreeSet: " + treeSet);
    }
}
