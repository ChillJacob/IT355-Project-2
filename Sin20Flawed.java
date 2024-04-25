import java.util.Random;

public class Sin20Flawed {
    private Random random = new Random();

    public String generateSessionId() {
        // Generates a session ID using java.util.Random
        int sessionId = random.nextInt(1000000);
        return String.format("%06d", sessionId);
    }
}
