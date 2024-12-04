public class BreakContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue; // Skip numbers divisible by 3
            }

            if (i > 25) {
                break; // Exit the loop when the number exceeds 50
            }

            System.out.print(i + " ");
        }
    }
}
