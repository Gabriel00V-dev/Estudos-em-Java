import java.io.FileNotFoundException;

public class MainExcecao_S04L11 {
    public static void main(String[] args) {
        Pessoa_S04L11 pessoa = new Pessoa_S04L11();
        Funcionario_S04L11 funcionario = new Funcionario_S04L11();

        try {
            funcionario.salvar();
        } catch (LoginInvalidoException_S04L10 | FileNotFoundException e) {
            e.printStackTrace();

        }
    }
}
