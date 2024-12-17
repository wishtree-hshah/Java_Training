import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * File class example to show all methods
 */
public class FileClassExample {

    /**
     * To create a new file
     * @param file
     */
    public void createFile(File file){
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * To show all the basic methods related to file
     * @param file
     */
    public void fileMethods(File file){
        System.out.println("File name :" + file.getName());
        System.out.println("Path: " + file.getPath());
        System.out.println("Absolute path:"
                + file.getAbsolutePath());
        System.out.println("Parent:" + file.getParent());
        System.out.println("Exists :" + file.exists());

        if (file.exists()) {
            System.out.println("Is writable:"
                    + file.canWrite());
            System.out.println("Is readable" + file.canRead());
            System.out.println("Is a directory:"
                    + file.isDirectory());
            System.out.println("File Size in bytes "
                    + file.length());
        }
    }

    /**
     * To write in the file through scanner
     * @param file
     */
    public void writeFile(File file){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to write in file: ");
        String string = scanner.nextLine();
        try {
            Files.writeString(file.toPath(),string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * To read the content of the file
     * @param file
     */
    public void readFile(File file){
        try {
            String fileContent = Files.readString(file.toPath());
            System.out.println(fileContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * To delete the file
     * @param file
     */
    public void deleteFile(File file){
        file.delete();
        System.out.println("File deleted successfully");
    }

    public static void main(String[] args) throws IOException {
        FileClassExample fileClassExample = new FileClassExample();
        // create a file object
        File file = new File("D:\\Wishtree Technologies\\Java_Training\\Day10\\FileIO\\src\\example.txt");
        //creating file
        fileClassExample.createFile(file);
        // apply File class methods on File object
        fileClassExample.fileMethods(file);
        // writing to file
        fileClassExample.writeFile(file);
        //reading the file
        fileClassExample.readFile(file);
        //deleting the file
        fileClassExample.deleteFile(file);
    }
}
