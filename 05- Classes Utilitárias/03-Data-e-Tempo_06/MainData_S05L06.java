import java.text.SimpleDateFormat;
import java.util.Date;

public class MainData_S05L06 {
    public static void main(String[] args) {
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));
    }
}
