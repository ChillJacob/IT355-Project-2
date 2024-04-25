import java.util.HashMap;
import java.util.Map;

public class Sin19Flawed {
    private Map<String, String> users = new HashMap<>();

    public Sin19Flawed() {
        // Insecure storage of passwords
        users.put("user1", "password123");
        users.put("user2", "abc123");
    }

    public boolean login(String username, String password) {
        String storedPassword = users.get(username);
        if (storedPassword != null && storedPassword.equals(password)) {
            System.out.println("Login successful for user: " + username);
            return true;
        } else {
            System.out.println("Login failed for user: " + username);
            return false;
        }
    }

    public static void main(String[] args) {
        Sin19Flawed system = new Sin19Flawed();
        // Simulate login attempts
        system.login("user1", "password123"); // Should succeed
        system.login("user2", "abc123");      // Should succeed
        system.login("user1", "wrongpass");   // Should fail
    }
}
