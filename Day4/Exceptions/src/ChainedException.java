import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ChainedException {
    public static void main(String[] args) {
        try {
            try {
                // Attempting to read a non-existent file
                Scanner scanner = new Scanner(new File("nonexistent.txt"));
            } catch (FileNotFoundException e) {
                // Wrapping the FileNotFoundException in a RuntimeException
                RuntimeException runtimeException = new RuntimeException("File operation failed");
                runtimeException.initCause(e);
                throw runtimeException;
            }
        } catch (RuntimeException ex) {
            // Displaying the main exception
            System.out.println("Caught Exception: " + ex.getMessage());
            // Displaying the actual cause
            System.out.println("Root Cause: " + ex.getCause());
        }
    }
}
