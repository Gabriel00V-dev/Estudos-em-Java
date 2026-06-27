import java.util.Hashtable;

public class MainHash_S02L03 {
    public static void main(String[] args) {
        /*
        HashTable -> not thread safe
        Hashmap -> Thread safe 
        Uma chave nunca pode ser igual a outra
        Uma chave nunca pode mudar*/
        Hashtable<Integer, PersonHash_S02L03> ht = new Hashtable<>();

        PersonHash_S02L03 p1 = new PersonHash_S02L03(1, "Caio");
        PersonHash_S02L03 p2 = new PersonHash_S02L03(2, "Paulo");
        PersonHash_S02L03 p3 = new PersonHash_S02L03(3, "Cesar");
        PersonHash_S02L03 p4 = new PersonHash_S02L03(4, "Lorenzo");

        ht.put(p1.getId(), p1);
        ht.put(p2.getId(), p2);
        ht.put(p3.getId(), p3);
        ht.put(p4.getId(), p4);

        for(Integer key : ht.keySet()){
            System.out.println(ht.get(key));
        }

        System.out.println(ht.get(-1)); //null
        System.out.println(ht.get(p3.getId()));
    }
}
