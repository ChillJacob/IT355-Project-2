import java.security.SecureRandom;
import java.math.BigInteger;

public class Sin20Fixed {
    private SecureRandom secureRandom = new SecureRandom();

    public String generateSessionId() {
        // Generates a cryptographically secure session ID using SecureRandom
        byte[] sessionIdBytes = new byte[16];
        secureRandom.nextBytes(sessionIdBytes);
        BigInteger sessionIdInt = new BigInteger(1, sessionIdBytes);
        return sessionIdInt.toString(16);
    }
}
