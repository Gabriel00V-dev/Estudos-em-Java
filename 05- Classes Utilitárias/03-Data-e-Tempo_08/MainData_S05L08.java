import java.time.LocalTime;

public class MainData_S05L08 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(20, 20, 30);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);
        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
