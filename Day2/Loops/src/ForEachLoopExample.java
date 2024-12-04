// Java Program to calculate the sum of elements in an array
public class ForEachLoopExample {
    public static void main(String[] args) {

        int[] numbers = {5, 10, 15, 20, 25};

        int totalSum = calculateSum(numbers);
        System.out.println("Total Sum: " + totalSum);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;

        // Iterates through the array
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
}
