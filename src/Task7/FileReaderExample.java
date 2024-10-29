package Task7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class FileReaderExample {
    public static void main(String[] args) {
        // Define the file path
        String filePath = "data.txt";
        
        // Try to read the file
        try {
            File file = new File(filePath);
            Scanner scanner = new Scanner(file);
 
            // Read the file line by line
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
 
            scanner.close();
        }
        // Handle case where the file is not found
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please check the file path and try again.");
        }
    }
}
