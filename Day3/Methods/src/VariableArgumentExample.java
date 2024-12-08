public class VariableArgumentExample {
    // This method will take arguments dynamically
    public static void addNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        addNumbers(10, 20, 30); // Sum: 60
        addNumbers(5, 15);      // Sum: 20
        addNumbers();           // Sum: 0
    }
}
