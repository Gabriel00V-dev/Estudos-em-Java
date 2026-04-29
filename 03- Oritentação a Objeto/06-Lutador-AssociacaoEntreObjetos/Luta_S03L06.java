import java.util.Random;

public class Luta_S03L06 {
    private Lutador_S03L06 desafiado;
    private Lutador_S03L06 desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador_S03L06 l1, Lutador_S03L06 l2){
        if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)){
            this.setAprovada(true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar(){
        if(this.getAprovada() == true){
            System.out.println("##DESAFIADO##");
            this.getDesafiado().apresentar();
            System.out.println("\n##DESAFIANTE##");
            
            this.getDesafiante().apresentar();
            Random random = new Random();
            int vencedor = random.nextInt(3);
            
            switch (vencedor) {
                case 0: //Empate
                    System.out.println("\nEmpatou!!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                
                case 1: //Ganhou desafiado
                    System.out.println("\nO desafiado " + this.getDesafiado().getNome() + " Venceu!!!");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    
                    break;
            
                case 2: //Ganhou desafiante
                    System.out.println("\nO desafiante " + this.getDesafiante().getNome() + " Venceu!!!");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;

                default:
                    break;
            }
        }else{
            System.out.println("Luta_S03L06 não pode acontecer");
        }
    }
    
    public void setDesafiado(Lutador_S03L06 dd){
        this.desafiado = dd;
    }

    public Lutador_S03L06 getDesafiado(){
        return desafiado;
    }

   
    public void setDesafiante(Lutador_S03L06 dt){
        this.desafiante = dt;
    }

    public Lutador_S03L06 getDesafiante(){
        return desafiante;
    }

    public void setRounds(int r){
        this.rounds = r;
    }

    public int getRounds(){
        return rounds;
    }

    public void setAprovada(boolean a){
        this.aprovada = a;
    }

    public boolean getAprovada(){
        return aprovada;
    }
    


}
