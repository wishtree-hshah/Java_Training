package CharacterStreams;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * PrintWriterExample demonstrates how to use the PrintWriter class
 * for writing formatted text to a file.
 */
public class PrintWriterExample {
    public static void main(String[] args) {
        PrintWriter printWriter = null;

        try {
            // Create a PrintWriter object to write to the file
            printWriter = new PrintWriter("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\CharacterStreams\\output.txt");

            String string = "";
            while(true){
                // Read user input from the console
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                string = bufferedReader.readLine();
                // Stop the loop if the user types "exit"
                if(string.equals("exit"))
                    break;
                // Write the input to the file
                printWriter.println(string);
            }

            System.out.println("Content written to file successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Close the printWriter to release resources
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}

