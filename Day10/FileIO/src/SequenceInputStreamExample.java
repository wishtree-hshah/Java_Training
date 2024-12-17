import java.io.*;

/**
 * Example to show SequenceInputStream working
 */
public class SequenceInputStreamExample {
    public static void main(String[] args) {
        // Creating InputStream objects for two text files
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream sequenceInputStream = null;

        try {
            // Open the two files for reading
            file1 = new FileInputStream("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\File1.txt");
            file2 = new FileInputStream("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\File2.txt");

            // Combine both input streams into a single SequenceInputStream
            sequenceInputStream = new SequenceInputStream(file1, file2);

            // Reading and printing the content of the combined input streams
            int byteRead;
            while ((byteRead = sequenceInputStream.read()) != -1) {
                System.out.print((char) byteRead);  // Print each byte as a character
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (sequenceInputStream != null) sequenceInputStream.close();
                if (file1 != null) file1.close();
                if (file2 != null) file2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
