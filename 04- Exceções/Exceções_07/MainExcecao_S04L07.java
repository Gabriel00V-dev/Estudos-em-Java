import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MainExcecao_S04L07 {
    public static void main(String[] args) {
        try{
            throw new RuntimeException();
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Dentro do ArrayIndexOutOfBoundsException");
        }catch(IndexOutOfBoundsException e){
            System.out.println("Dentro do IndexOutOfBoundsException");
        }catch(IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch(ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch(RuntimeException e){
            System.out.println("Dentro do RuntimeException"); //Exceções mais genéricas sempre tem que vir no final
        }

        try{
            talvezLanceException();
        }catch(SQLException e){
            e.printStackTrace();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
