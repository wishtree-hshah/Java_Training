import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * To implement basic methods of collection
 */
public class CollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //To add single element in list
        list.add("Apple");
        list.add("Mango");
        //to add one or more elements in list
        Collections.addAll(list,"Kiwi","Banana");

        for (int i = 0; i < list.size(); i++) {
            //get all the elements by index
            System.out.print(list.get(i) + " ");
        }

        System.out.print("\nAfter sorting: ");
        //to sort the list
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            //get all the elements by index
            System.out.print(list.get(i) + " ");
        }

        //binary search on list
        System.out.println("\nIndex of Kiwi is : " + Collections.binarySearch(list,"Kiwi"));

        List<String> list1 = new ArrayList<>();
        list1.add("Tomato");
        list1.add("Potato");

        //copy the elements from list1 to list
        Collections.copy(list,list1);

        System.out.print("list after copying from list1: ");
        for (int i = 0; i < list.size(); i++) {
            //get all the elements by index
            System.out.print(list.get(i) + " ");
        }

        List<String> list2 = new ArrayList<>();
        list2.add("Grapes");
        list2.add("Apple");
        // Check if disjoint or not
        System.out.println("\n" + Collections.disjoint(list, list2));
    }
}
