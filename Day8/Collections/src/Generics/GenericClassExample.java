package Generics;

/**
 * Main class to test the Pair class
 */
public class GenericClassExample {
    public static void main(String[] args) {
        // Create a Pair of Integer and String
        Pair<Integer, String> pair1 = new Pair<>(1, "Apple");
        pair1.printPair(); // Output: First: 1, Second: Apple

        // Create a Pair of String and Double
        Pair<String, Double> pair2 = new Pair<>("Price", 9.99);
        pair2.printPair(); // Output: First: Price, Second: 9.99

        // Create a Pair of Boolean and Character
        Pair<Boolean, Character> pair3 = new Pair<>(true, 'A');
        pair3.printPair(); // Output: First: true, Second: A
    }
}
