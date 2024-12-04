public class AssigmentOperator {
    public static void main(String[] args) {
        int f = 8;
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010)); //AND
        System.out.println("f |= 0b1100: " + (f |= 0b1100)); // OR
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010)); //XOR
        System.out.println("f <<= 2: " + (f <<= 2)); // left side
        System.out.println("f >>= 1: " + (f >>= 1)); // right side
        System.out.println("f >>>= 1: " + (f >>>= 1)); // right side
    }
}
