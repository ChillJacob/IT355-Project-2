import java.io.*;
import java.security.*;
import javax.crypto.*;
import javax.crypto.spec.*;

public class Sin17Fixed {

    private static final String AES_SECRET_KEY = "MySecretKey123"; // This should be securely stored elsewhere

    public static void main(String[] args) {
        // Fix: Encrypt sensitive data before storing
        String password = "secret123"; // Sensitive data

        try {
            // Generate secret key
            SecretKeySpec secretKey = new SecretKeySpec(AES_SECRET_KEY.getBytes(), "AES");
            
            // Create cipher instance
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKey);
            
            // Encrypt password
            byte[] encryptedPassword = cipher.doFinal(password.getBytes());

            // Store encrypted password in file
            try (FileOutputStream fos = new FileOutputStream("password_encrypted.txt")) {
                fos.write(encryptedPassword);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException |
                 IllegalBlockSizeException | BadPaddingException e) {
            e.printStackTrace();
        }
    }
}
