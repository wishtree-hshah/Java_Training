package CharacterStreams;

import java.io.*;

/**
 * BufferedStreamExample demonstrates the use of BufferedReader and BufferedWriter
 * for reading and writing text files in Java.
 */
public class BufferedStreamExample {
    public static void main(String[] args) throws IOException {
        // this will handle reading and writing operations
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            // object to read the file at the specified path
            reader = new BufferedReader(new FileReader("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\CharacterStreams\\input.txt"));
            // object to write the file at the specified path
            writer = new BufferedWriter(new FileWriter("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\CharacterStreams\\output.txt"));

            String line;
            // Reads one line of text from the input file
            while ((line = reader.readLine()) != null) {
                // Writes the current line from the input file to the output file
                writer.write(line);
                // adds newline character
                writer.newLine();
            }
            System.out.println("File copied successfully!");
        } finally {
            // release system resources
            if (reader != null) reader.close();
            if (writer != null) writer.close();
        }
    }
}
