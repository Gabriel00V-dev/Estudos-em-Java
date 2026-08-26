public class MainCI_S06L02 {
    private String name = "Carlos";

    void print(final String param){
        final String lastName = "da Silva";

        class LocalClass{
            public void printLocal(){
                System.out.println(param);
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        MainCI_S06L02 main = new MainCI_S06L02();
        main.print("Pão");
    }
}
