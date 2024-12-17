import java.io.*;

/**
 * This class demonstrates the use of FileDescriptor to check
 * the validity of file operations.
 */
public class FileDescriptorExample {
    public static void main(String[] args) {
        FileDescriptor fileDescriptor = null;
        FileOutputStream fileOutputStream = null;
        FileInputStream fileInputStream = null;

        try {
            // Writing to the file using FileOutputStream
            fileOutputStream = new FileOutputStream("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\FILE.txt");
            byte[] data = "Hello, How are you?".getBytes();
            fileOutputStream.write(data);

            // Getting the FileDescriptor for the written file
            fileDescriptor = fileOutputStream.getFD();

            // Syncing the file to ensure the data is written to disk
            fileDescriptor.sync();
            System.out.println("File sync successful! Data written to FILE.txt.");

            // Closing the FileOutputStream
            fileOutputStream.close();

            // Reading the file using FileInputStream to check if it's valid
            fileInputStream = new FileInputStream("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\FILE.txt");

            // Getting the FileDescriptor from FileInputStream
            fileDescriptor = fileInputStream.getFD();

            // Checking if the FileDescriptor is valid
            boolean isValid = fileDescriptor.valid();
            System.out.println("FileDescriptor is valid: " + isValid);

            // Closing the FileInputStream
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
