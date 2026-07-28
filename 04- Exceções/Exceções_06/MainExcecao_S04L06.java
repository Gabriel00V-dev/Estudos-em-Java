public class MainExcecao_S04L06 {
    public static void main(String[] args) {
        abreConexao2();
    }

    private static String abreConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            return "conexão aberta";
        }catch(Exception e){
            e.printStackTrace();
        }finally{ //Finally sempre sempre é executado
            System.out.println("Fechando recurso liberado pelo SO");
        }
        return null;
    }

        private static String abreConexao2(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo dados no arquivo");
            throw new RuntimeException();
        }finally{ 
            System.out.println("Fechando recurso liberado pelo SO");
        }
    }
}
