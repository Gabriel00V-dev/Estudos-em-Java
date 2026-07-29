public class MainWrapper_S05L01{
    public static void main(String[] args) {       
       //Tipos Primitivos
        byte byteP = 1;
        short shortP = 1;
        int intP = 10;
        long longP = 10;
        float floatP = 10f;
        double doubleP = 10;
        char charP = 'W';
        boolean booleanP = false;

        //Wrapper transforma os tipos primitivos em classes
        //aplicando todas as regras de classes/polimorfismo a eles
        
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 10; //autoboxing 
        Long longW = 10l;
        Float floatW = 10f;
        Double doubleW = 10d;
        Character charW = 'W';
        Boolean booleanW = false;
        
        int i = intW; //unboxing
        Integer intW2 = Integer.parseInt("1");
        boolean verdadeiro = Boolean.parseBoolean("TruE"); //Aceita uppercase
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('A'));
    }
}