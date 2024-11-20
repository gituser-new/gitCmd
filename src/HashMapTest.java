import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args){

        HashMap<String, String > hs= new HashMap<String, String>();
        hs.put("1","java");
        hs.put("2","java");
        hs.put("3",null);
        hs.put(null,null);
        hs.put(null,null);

        System.out.print("HashMap elements/objects:  " + hs + "Size" + hs.size());

        System.out.print("\n"+"HashMap elements for key 2:  " + hs.get("2"));

        hs.remove("3");
        System.out.print("\n"+"HashMap elements/objects:  " + hs);
                //allows only one null key and multiple null values


        //output below
        //o.t:: HashMap elements/objects:  {null=null, 1=java, 2=core, 3=null}Size4
        //HashMap elements for key 2:  core
        //HashMap elements/objects:  {null=null, 1=java, 2=core}

    }

}


