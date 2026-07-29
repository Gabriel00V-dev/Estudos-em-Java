import java.util.Scanner;

public class MainExcecao_S04L10 {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException_S04L10 e) {
            e.printStackTrace();
        }
    }   

    private static void logar() throws LoginInvalidoException_S04L10{
        Scanner sc = new Scanner(System.in);
        String usernameDB = "João";
        String senhaDB = "senha123";
        System.out.println("Usuario");
        String usernameDigitado = sc.nextLine();
        System.out.println("Senha");
        String senhaDigitada = sc.nextLine();

        if(!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)){
            throw new LoginInvalidoException_S04L10("Usuario ou senha inválidos");
        }

        System.out.println("Usuario logado com sucesso");
    }
}
