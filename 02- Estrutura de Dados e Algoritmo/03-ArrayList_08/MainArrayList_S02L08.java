import java.util.Scanner;
import java.util.ArrayList;

public class MainArrayList_S02L08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> nomeProduto = new ArrayList<>();
        ArrayList <Float> precoProduto = new ArrayList<>();

        int op = 0;
        do{
            System.out.println("\n----MENU----");
            System.out.println("1) Adicionar Produto");
            System.out.println("2) Listar Produtos");
            System.out.println("3) Remover produto");
            System.out.println("4) Sair");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    sc.nextLine();
                    System.out.println("Nome do Produto: ");
                    nomeProduto.add(sc.nextLine());

                    System.out.println("Preço do produto: ");
                    precoProduto.add(sc.nextFloat());
                    System.out.println("\nProduto adicionado com sucesso!!");
                    break;

                case 2:
                    float precoTotal = 0;
                    System.out.println("---LISTA DE PRODUTOS---");
                    for(int i = 0; i < nomeProduto.size(); i++){
                        System.out.printf("|Produto: " + nomeProduto.get(i) + " - Preço: " + precoProduto.get(i) + "|\n");
                        precoTotal = precoTotal + precoProduto.get(i);
                    }
                    System.out.printf("\nValor Total: " + precoTotal);
                    break;
                
                case 3:
                    sc.nextLine();
                    System.out.println("Digite o nome do produto a ser removido: ");
                    String prod = sc.nextLine();
                    boolean produto = nomeProduto.contains(prod);
                    if(produto == true){
                        int idx = nomeProduto.indexOf(prod);
                        nomeProduto.remove(idx);
                        precoProduto.remove(idx);
                        System.out.println("Produto deletado com sucesso");
                        break;
                    }
                    System.out.println("Produto não existente!");

                    break;
            
                case 4:
                    System.out.println("...Programa encerrado...");
                    break;
                default:
                    System.out.println("Digite um numero válido!");
                    break;
            }
        }while(op != 4);
    }
}
