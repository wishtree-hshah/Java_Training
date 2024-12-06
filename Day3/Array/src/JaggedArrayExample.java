public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare a jagged array
        int[][] jaggedArray = new int[3][];

        // Initialize each row with different lengths
        jaggedArray[0] = new int[] {1, 2};
        jaggedArray[1] = new int[] {3, 4, 5};
        jaggedArray[2] = new int[] {6, 7, 8, 9};

        // Print the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }
    }
}
