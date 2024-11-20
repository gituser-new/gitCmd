import java.util.Hashtable;

public class HashTableTest {
    public static void main(String[] args){

        Hashtable<String, String > hs= new Hashtable<String, String>();
        hs.put("1","java");
        hs.put("2","core");
        hs.put("3","learning");


        System.out.print("Hashtable elements/objects:  "
                + hs+ "\n" + hs.contains("java") + "\n" +hs.containsKey("1"));

        //o/t>> Hashtable elements/objects:  {3=learning, 2=core, 1=java}


        //doesn't allow  null key and null values. no order when retrieval some random order
        // Items in a hash table are ordered by their hash value, which isn't an order that makes any sense to people.
        // If you want to traverse the contents in order, then a hash table isn't a good choice.



    }
}
