import java.util.stream.IntStream;

public class InitializationUsingStreams {
    public static void main(String[] args) {
        int[] arr1 = IntStream.range(1, 9).toArray();
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        int[] arr2 = IntStream.rangeClosed(1, 5).toArray();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        int[] arr3 = IntStream.of(1, 2, 3, 4).toArray();
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
    }
}
