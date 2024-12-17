package ByteStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Example of FileInputStream and FileOutputStream to read
 * from a file and write to a file
 */
public class ByteStreamExample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;

        try {
            // Open source and destination files
            inputStream = new FileInputStream("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\ByteStreams\\image.jpeg");
            outputStream = new FileOutputStream("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\ByteStreams\\image1.jpeg");

            // Read and write data byte by byte
            int byteData;
            while ((byteData = inputStream.read()) != -1) {
                outputStream.write(byteData);
            }
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close streams to release system resources
            try {
                if (inputStream != null) inputStream.close();
                if (outputStream != null) outputStream.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
