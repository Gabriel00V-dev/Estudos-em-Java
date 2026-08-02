import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class MainData_S05L05 {
    public static void main(String[] args) {

        /*Países e Linguagens suportadas
        System.out.println(Locale.getDefault());
        String[] isoContries = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();
        for(String isoLanguage : isoLanguages){
            System.out.print(isoLanguage + " ");
        }
        System.out.println();

        for(String isoContry : isoContries){
            System.out.print(isoContry+ " ");
        }*/

            Locale localeDefault = Locale.getDefault();
            Locale localeBR = new Locale("pt", "BR");
            Locale localeJP = Locale.JAPAN;
            Locale LocaleIT = Locale.ITALY;
            NumberFormat[] nfa = new NumberFormat[4];
            nfa[0] = NumberFormat.getCurrencyInstance(localeDefault);
            nfa[1] = NumberFormat.getCurrencyInstance(localeBR);
            nfa[2] = NumberFormat.getCurrencyInstance(localeJP);
            nfa[3] = NumberFormat.getCurrencyInstance(LocaleIT);
            double valor = 1000.2130;

            for(NumberFormat numberFormat : nfa){
                numberFormat.setMaximumFractionDigits(2);
                System.out.println(numberFormat.format(valor));
            }

            String valorString = "1.000,21";
            
            try {
                System.out.println(nfa[0].parse(valorString));
            } catch (ParseException e) {
                e.printStackTrace();
            }

    }
}
