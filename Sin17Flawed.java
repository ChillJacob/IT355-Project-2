import java.io.*;

public class Sin17Flawed {

    public static void main(String[] args) {
        // Violation: Storing sensitive data in plaintext
        String password = "secret123";

        try (FileWriter writer = new FileWriter("password.txt")) {
            writer.write(password);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
