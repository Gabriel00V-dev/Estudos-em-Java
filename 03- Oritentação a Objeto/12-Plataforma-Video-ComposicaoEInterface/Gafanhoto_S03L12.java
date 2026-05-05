public class Gafanhoto_S03L12 extends Pessoa_S03L12{
    private String login;
    private int totAssistido;

    public Gafanhoto_S03L12(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totAssistido = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        this.totAssistido++;
        System.out.println("Total visualização: " + this.getTotAssistido());
    }


    @Override
    public String toString() {
        return super.toString()  +" Gafanhoto_S03L12 [login=" + login + ", totAssistido=" + totAssistido + "]";
    }

}
