import java.time.LocalDate; //Classe Imutável
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class MainData_S05L07 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        System.out.println(Month.JANUARY.getValue());
        LocalDate date = LocalDate.of(2026, 04, 30); //Data pré definida
        LocalDate agora = LocalDate.now(); //Data de Agora
        System.out.println(date.getYear()); //Pega o ano definido na date
        System.out.println(date.getMonth()); //Pega o mês definido na fate
        System.out.println(date.getMonthValue()); //Valor do mes definido Abril -> 4
        System.out.println(date.getDayOfYear()); //Numero de dias definidos na date
        System.out.println(date.getDayOfWeek()); //Dia da Semana
        System.out.println(date.getDayOfMonth()); //Dia do Mês
        System.out.println(date.lengthOfMonth()); //Tamanho do mês
        System.out.println(date.isLeapYear()); //Se pergunta se o ano é bissexto
        System.out.println(date); //Data definida no Date
        System.out.println(agora); //Data de Agora
        System.out.println(LocalDate.MAX); //Maximo de anos possíveis de trabalhar com LocalDate
        System.out.println(LocalDate.MIN); //Mínimo de anos possíveis de trabalhar com LocalDate
    }    
}
