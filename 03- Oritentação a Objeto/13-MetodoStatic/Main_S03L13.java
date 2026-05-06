public class Main_S03L13{
    public static void main(String[] args) {
        Funcionario_S03L13 x = new Funcionario_S03L13("Maria", 100.0, 15);
        Funcionario_S03L13 y = new Funcionario_S03L13("João", 80, 10);
        System.out.println(x.valorPago());
        System.out.println(y.valorPago());

        double resultado = CalculadoraDeSalario_S03L13.valorPago(100, 7);

        System.out.println(resultado);

    }
}