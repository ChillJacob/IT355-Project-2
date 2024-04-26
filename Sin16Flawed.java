import java.io.File;
import java.io.IOException;

public class Sin16Flawed
{
    public static void main(String[] args) {
        // Violation: Running code with unnecessary privileges
        File file = new File("/tempFile");

        // Attempt to read the file
        try {
            // Reading the file
            if (file.exists()) {
                System.out.println("File exists. Reading contents...");
                // This code will execute with the same privileges as the user running the program
                String contents = FileUtility.readFileContents(file);
                System.out.println("File contents: \n" + contents);
            } else {
                System.out.println("File does not exist.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

class FileUtility {
    // Method to read file contents
    public static String readFileContents(File file) throws IOException {
        // This method should only be accessible with necessary privileges
        StringBuilder contentBuilder = new StringBuilder();
        java.util.Scanner scanner = new java.util.Scanner(file);
        while (scanner.hasNextLine()) {
            contentBuilder.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return contentBuilder.toString();
    }
}
