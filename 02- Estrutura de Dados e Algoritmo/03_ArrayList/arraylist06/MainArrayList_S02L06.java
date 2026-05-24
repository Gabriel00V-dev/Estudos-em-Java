import java.util.ArrayList;

public class MainArrayList_S02L06 {
    public static void main(String[] args) {
        ArrayList <Integer> n1 = new ArrayList<>();
        ArrayList <Integer> n2 = new ArrayList<>();

        n1.add(3); n1.add(5); n1.add(8); n1.add(5); n1.add(3);

        System.out.println(n1);
        for(int i = 0; i< n1.size(); i++){
            int n = n1.get(i);
            if(!n2.contains(n)){
               n2.add(n);
            }
        }

        System.out.println(n2);

    }
}
