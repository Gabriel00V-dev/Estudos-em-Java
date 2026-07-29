import java.io.FileNotFoundException;

public class Funcionario_S04L11 extends Pessoa_S04L11{
    public void salvar() throws LoginInvalidoException_S04L10, FileNotFoundException{ //Não pode ter exceções mais genéricas que a classe mãe
        System.out.println("Salvando funcionario");
    }
}
