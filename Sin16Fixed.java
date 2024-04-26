import java.io.File;
import java.io.IOException;

public class Sin16Fixed {
    public static void main(String[] args) {
        // Fix: Running code with least privilege
        String fileName = "/tempfile";
        
        try {
            // Reading the file using least privilege
            if (FileUtility.isFileAccessible(fileName)) {
                System.out.println("File exists. Reading contents...");
                // This code will execute with the least privileges required
                String contents = FileUtility.readFileContents(fileName);
                System.out.println("File contents: \n" + contents);
            } else {
                System.out.println("File does not exist or access is denied.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}

class FileUtility {
    // Method to check if file is accessible
    public static boolean isFileAccessible(String fileName) {
        File file = new File(fileName);
        return file.exists() && file.canRead(); // Check if file exists and if it's readable
    }

    // Method to read file contents
    public static String readFileContents(String fileName) throws IOException {
        // This method should only be accessible with necessary privileges
        File file = new File(fileName);
        StringBuilder contentBuilder = new StringBuilder();
        java.util.Scanner scanner = new java.util.Scanner(file);
        while (scanner.hasNextLine()) {
            contentBuilder.append(scanner.nextLine()).append("\n");
        }
        scanner.close();
        return contentBuilder.toString();
    }
}
