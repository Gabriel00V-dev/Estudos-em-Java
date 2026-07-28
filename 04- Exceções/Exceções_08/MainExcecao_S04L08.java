import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class MainExcecao_S04L08 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){ //Multi catch em Linha
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("Dentro do RunTimeException");
        }

        try{
            talvezLanceException();
        }catch(IOException | SQLException e){ //
            e.printStackTrace();
        }

    }
    private static void talvezLanceException() throws SQLException, IOException{

    }
}
