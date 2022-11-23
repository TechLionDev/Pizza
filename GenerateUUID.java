import java.util.UUID;

@SuppressWarnings("ALL")
public class GenerateUUID {
    public static String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }
}