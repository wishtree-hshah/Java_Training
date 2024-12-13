package List;

import java.util.ArrayList;
import java.util.List;

/**
 * Class to implement basic methods of java lists
 */
public class JavaList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //adding element to list
        list.add("Cow");
        list.add("Monkey");
        list.add("Lion");
        list.add("Tiger");
        for (int i = 0; i < list.size(); i++) {
            //get all the elements by index
            System.out.print(list.get(i) + " ");
        }

        list.set(1,"Tiger");
        System.out.println("\nAfter updating list at index 1:");
        for (int i = 0; i < list.size(); i++) {
            //get all the elements by index
            System.out.print(list.get(i) + " ");
        }

        //to find the last occurrence of tiger
        int lastIndexOf = list.lastIndexOf("Tiger");
        System.out.println("\nLast Occurrence of tiger: " + lastIndexOf);

        //removing from element
        list.remove("Lion");
        System.out.println("After removing lion: " + list);

        //removing by index
        list.remove(2);
        System.out.println("After removing index 2: " + list);

        //checking if the object is present or not
        System.out.println("Checking for Cow: " + list.contains("Cow"));
    }
}
