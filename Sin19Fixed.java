import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;
import java.util.Base64;

public class Sin19Fixed {
    private Map<String, String> users = new HashMap<>();

    public Sin19Fixed() {
        // Insecure storage of passwords
        users.put("user1", hashPassword("password123"));
        users.put("user2", hashPassword("abc123"));
    }

    public boolean login(String username, String password) {
        String storedPasswordHash = users.get(username);
        if (storedPasswordHash != null) {
            String enteredPasswordHash = hashPassword(password);
            return storedPasswordHash.equals(enteredPasswordHash);
        } else {
            return false;
        }
    }

    private String hashPassword(String password) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            byte[] hashedPasswordBytes = digest.digest(password.getBytes());
            return Base64.getEncoder().encodeToString(hashedPasswordBytes);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Sin19Fixed system = new Sin19Fixed();
        // Simulate login attempts
        System.out.println(system.login("user1", "password123")); // Should succeed
        System.out.println(system.login("user2", "abc123"));      // Should succeed
        System.out.println(system.login("user1", "wrongpass"));   // Should fail
    }
}
