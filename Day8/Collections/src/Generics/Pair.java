package Generics;

/**
 * Generic class to hold a pair of values
 * @param <T>
 * @param <U>
 */
class Pair<T, U> {
    private T first;  // First value of type T
    private U second; // Second value of type U

    // Constructor to initialize pair
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    // Getter for first value
    public T getFirst() {
        return first;
    }

    // Getter for second value
    public U getSecond() {
        return second;
    }

    // Method to print the pair
    public void printPair() {
        System.out.println("First: " + first + ", Second: " + second);
    }
}
