public class MainCI_S06L04 {
    private String name = "João";

    static class Nested{
        private String lastName = "da Silva";

        void print(){
            System.out.println(new MainCI_S06L04().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
