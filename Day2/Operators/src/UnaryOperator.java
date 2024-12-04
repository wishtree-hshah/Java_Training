public class UnaryOperator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;

        // Unary plus and minus
        System.out.println(+num1); // Output: 5
        System.out.println(-num1); // Output: -5

        // Increment and Decrement
        System.out.println(num1++); // post-increment
        System.out.println(++num1); // Pre-increment

        System.out.println(num2--); // post-decrement
        System.out.println(--num2); // pre-decrement


        // Logical Complement
        boolean flag = true;
        System.out.println(!flag); // Output: false
    }
}
