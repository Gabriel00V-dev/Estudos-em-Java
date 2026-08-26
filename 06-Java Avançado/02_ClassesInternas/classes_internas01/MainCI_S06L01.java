public class MainCI_S06L01 {
    private String name = "Carlos";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this); //referencia ao this da classe interna
            System.out.println(MainCI_S06L01.this); //faz referencia ao this da classe mais externa
        }
    }

    public static void main(String[] args) {
        MainCI_S06L01 main = new MainCI_S06L01();
        Inner inner = main.new Inner();
        Inner inner2 = new MainCI_S06L01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
