public class Funcionario_S03L13 {
    public String nome;
    public double valorPorHora;
    public double horasTrabalhadas;
    
    public Funcionario_S03L13(String nome, double valorPorHora, double horasTrabalhadas) {
        this.nome = nome;
        this.valorPorHora = valorPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double valorPago(){
        return valorPorHora * horasTrabalhadas;
    }
}
