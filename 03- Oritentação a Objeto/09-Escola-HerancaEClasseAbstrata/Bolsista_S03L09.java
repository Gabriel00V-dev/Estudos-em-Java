public class Bolsista_S03L09 extends Aluno_S03L09{
    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensaldidade(){
        System.out.println(this.getNome() + " é bolsista, pagamento facilitado ");
        
    }
    
}
