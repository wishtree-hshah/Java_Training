import java.util.Arrays;
import java.util.Comparator;

public class DifferentMethods {
    public static void main(String[] args) {
        // 1. asList() - Converts the array to a List
        String[] array = {"Apple", "Banana", "Cherry"};
        System.out.println("asList: " + Arrays.asList(array));

        // 2. binarySearch() - Searches for the element in the array using binary search
        int[] numbers = {1, 3, 5, 7, 9};
        int index = Arrays.binarySearch(numbers, 5);
        System.out.println("binarySearch: Index of 5 is " + index);

        // 3. compare() - Compares two arrays lexicographically
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println("compare: " + Arrays.compare(array1, array2));

        // 4. copyOf() - Creates a copy of the array with a specified length
        int[] copiedArray = Arrays.copyOf(numbers, 7);
        System.out.println("copyOf: " + Arrays.toString(copiedArray));

        // 5. deepEquals() - Compares two arrays deeply to check if their contents are equal
        String[] array3 = {"Apple", "Banana"};
        String[] array4 = {"Apple", "Banana"};
        System.out.println("deepEquals: " + Arrays.deepEquals(array3, array4));

        // 6. equals() - Checks if two arrays are equal
        System.out.println("equals: " + Arrays.equals(array1, array2));

        // 7. fill() - Fills the array with the specified value
        Arrays.fill(array, "Mango");
        System.out.println("fill: " + Arrays.toString(array));

        // 8. hashCode() - Returns the hash code of the array
        System.out.println("hashCode: " + Arrays.hashCode(array1));

        // 9. mismatch() - Finds the first mismatched element between two arrays
        int[] array5 = {1, 2, 3};
        int[] array6 = {1, 2, 4};
        System.out.println("mismatch: " + Arrays.mismatch(array5, array6));

        // 10. parallelPrefix() - Performs parallel prefix computation on the array
        int[] array7 = {1, 2, 3, 4};
        Arrays.parallelPrefix(array7, (a, b) -> a + b);
        System.out.println("parallelPrefix: " + Arrays.toString(array7));

        // 11. sort() - Sorts the array in ascending order
        Arrays.sort(array);
        System.out.println("sort: " + Arrays.toString(array));

        // 12. spliterator() - Returns a Spliterator that can be used for traversing the array
        System.out.println("spliterator: " + Arrays.spliterator(array));

        // 13. stream() - Converts the array to a stream to perform operations like filtering or mapping
        Arrays.stream(array).forEach(System.out::println);

        // 14. toString() - Returns a string representation of the array's elements
        System.out.println("toString: " + Arrays.toString(array));
    }
}
