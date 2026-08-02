import java.time.Instant;
import java.time.LocalDateTime;

public class MainData_S05L10 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);
        System.out.println(LocalDateTime.now());
        System.out.println(now.getEpochSecond());
        System.out.println(now.getNano());
    }    
}
