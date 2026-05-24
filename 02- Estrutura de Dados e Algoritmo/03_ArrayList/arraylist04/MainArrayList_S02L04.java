import java.util.ArrayList;

public class MainArrayList_S02L04{
    public static void main(String[] args) {
        ArrayList <String> arraylist = new ArrayList<>();

        arraylist.add("A");
        arraylist.add("C");

        System.out.println(arraylist);

        arraylist.add(1, "B");

        System.out.println(arraylist);

        boolean existe = arraylist.contains("A");

        if(existe){
            System.out.println("Elemento existe no array");
        }else{
            System.out.println("Elemento não exist eno array");
        }

        int pos = arraylist.indexOf("B");
        if(pos > -1){
            System.out.println("Elemento existe no array na posição " + pos);
        }else{
            System.out.println("Elemento não existe no array " + pos);
        }

        System.out.println(arraylist.get(2));

        arraylist.remove(0);
        arraylist.remove("B");

    }
}