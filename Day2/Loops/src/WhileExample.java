//Java Program to calculate sum of all digit in number
public class WhileExample {
    public static void main(String[] args) {
        int number = 9876;

        while (number >= 10) {
            int sum = 0;

            while (number != 0) {
                sum += number % 10;  // Add each digit
                number /= 10;
            }

            number = sum;  // Replace the number with the sum of digits
        }

        System.out.println("Single Digit Sum: " + number);
    }
}
