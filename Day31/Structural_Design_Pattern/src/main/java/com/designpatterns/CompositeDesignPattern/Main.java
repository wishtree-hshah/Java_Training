package com.designpatterns.CompositeDesignPattern;

/**
 * The type Client.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        // Create Files
        File file1 = new File("file1.txt", 10);
        File file2 = new File("file2.jpg", 50);
        File file3 = new File("file3.mp3", 120);

        // Create Directories
        Directory dir1 = new Directory("Documents");
        Directory dir2 = new Directory("Music");

        // Add files to directories
        dir1.add(file1);
        dir1.add(file2);
        dir2.add(file3);

        // Create a parent directory and add subdirectories
        Directory rootDir = new Directory("Root");
        rootDir.add(dir1);
        rootDir.add(dir2);

        // Display the structure
        rootDir.showDetails();
    }
}
