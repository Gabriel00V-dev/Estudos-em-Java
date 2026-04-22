import java.util.Scanner;

public class Main_S01L10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = 0;

        do{
            System.out.println("----MENU----");
            System.out.println("[1] Área do circulo");
            System.out.println("[2] Área do retangulos");
            System.out.println("[3] Área do triangulo");
            System.out.println("[4] Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Digite o raio: ");
                    double r = sc.nextDouble();
                    if(r <= 0){
                        System.out.println("Valor Invalido"); 
                    break;
                    }else{
                        double area = Math.PI * (r * r);
                        System.out.println("A área do raio é: " + area);
                    }
                    break;
            
                case 2:
                    System.out.println("Digite a base");
                    double b = sc.nextDouble();

                    System.out.println("Digite a altura");
                    double h = sc.nextDouble();

                    System.out.println("O Valor da Área é: " + b * h);
                    break;

                case 3:
                    System.out.println("Digite a base");
                    double bt = sc.nextDouble();

                    System.out.println("Digite a altura");
                    double ht = sc.nextDouble();

                    System.out.println("O Valor da Área é: " + (bt * ht) / 2);
                    break;
                
                case 4:
                    System.out.println("Programa encerrado");
                break;
                
                default:
                    System.out.println("Valor inválido");
                    break;
            }

        }while(op != 4);
    }
}
