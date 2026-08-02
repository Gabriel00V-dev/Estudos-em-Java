import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;


public class MainData_S05L09 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.of(2024, 8, 6);
        LocalTime time = LocalTime.of(20, 45);

        //LocalDate date = LocalDate.parse("2024-08-06");
        //LocalTime time = LocalTime.parse("23:45:00");

        System.out.println(localDateTime);
        System.out.println(date);
        System.out.println(time);
        LocalDateTime ldt1 = date.atTime(time);
        LocalDateTime ldt2 = time.atDate(date);

        System.out.println(ldt1);
        System.out.println(ldt2);

    }
}
