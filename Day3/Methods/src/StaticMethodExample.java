class MathUtils {
    // Static method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

// Main Class
public class StaticMethodExample {
    public static void main(String[] args) {
        boolean isPrime = MathUtils.isPrime(29); // Calling static method
        System.out.println("Is 29 prime? " + isPrime);
    }
}
