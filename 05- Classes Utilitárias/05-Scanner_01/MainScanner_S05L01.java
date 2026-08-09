import java.util.Scanner;

public class MainScanner_S05L01 {
    public static void main(String[] args) {
        String texto = "João, Maria, Pedro, true, 200";
        Scanner sc = new Scanner(texto);
        sc.useDelimiter(",");
        while(sc.hasNext()){
            if(sc.hasNextInt()){
                int i = sc.nextInt();
                System.out.println("Int "+i);
            }else if(sc.hasNextBoolean()){
                boolean b = sc.nextBoolean();
                System.out.println("Boolean " + b);
            }else{
                System.out.println(sc.next());
            }
        }
    }
}
