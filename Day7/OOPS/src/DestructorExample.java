/**
 * Example to show how destructor works
 * From Java 9 instead of finalize close method is used
 */
public class DestructorExample implements AutoCloseable {

    public DestructorExample() {
        System.out.println("connection established.");
    }

    public void communicate() {
        System.out.println("Communicating...");
    }

    @Override
    public void close() {
        System.out.println("connection closed.");
    }

    public static void main(String[] args) {
        // Using try-with-resources to ensure connection is properly closed
        try (DestructorExample connection = new DestructorExample()) {
            connection.communicate();
        } // close() is automatically called here

        System.out.println("End of program.");
    }
}
