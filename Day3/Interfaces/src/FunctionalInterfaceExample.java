@FunctionalInterface
interface Cube {
    int calculate(int x);  // Abstract method
}

class FunctionalInterfaceExample {
    public static void main(String args[]) {
        int a = 5;

        // Lambda expression to define the calculate method
        Cube cube = (int x) -> x * x * x;

        // Calling the method
        int ans = cube.calculate(a);
        System.out.println(ans);  // Output: 25
    }
}
