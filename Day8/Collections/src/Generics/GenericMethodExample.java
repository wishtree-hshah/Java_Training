package Generics;

/**
 * Generic method example
 */
public class GenericMethodExample {

    /**
     * Generic method to swap two elements in an array
     * @param array
     * @param i
     * @param j
     * @param <T>
     */
    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        //Integer array
        Integer[] intArray = {1, 2, 3, 4};
        System.out.println("Before Swap: " + intArray[0] + ", " + intArray[3]);
        swap(intArray, 0, 3);
        System.out.println("After Swap: " + intArray[0] + ", " + intArray[3]);

        //String array
        String[] strArray = {"apple", "banana", "cherry"};
        System.out.println("\nBefore Swap: " + strArray[0] + ", " + strArray[2]);
        swap(strArray, 0, 2);
        System.out.println("After Swap: " + strArray[0] + ", " + strArray[2]);
    }
}
