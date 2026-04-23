import java.util.Scanner;

public class Main_S03L02{
    public static void main(String[] args) {
    Caneta_S03L02 c1 = new Caneta_S03L02();
    c1.modelo = "Bic Cristal";
    //c1.ponta = 0.5f;
    c1.carga = 80;
    //c1.tampada = true;
    c1.destampar();
    c1.status();
    
    }
}
