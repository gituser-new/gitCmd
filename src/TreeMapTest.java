import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String, String> hs = new TreeMap<String, String>();

        hs.put("5", "java");
        hs.put("3", "core");
        hs.put("2", "learning");
        hs.put("1", "learning");  // allows duplicates values if keys are different
        hs.put("1", "learningOfCoreJava"); // overrides the value if for two value key is same

        System.out.print("Hashtable elements/objects:  " + hs);

        // hashmap is faster than treemap..
        //out put>> Hashtable elements/objects:  {2=learning, 3=core, 5=java}
        // sorted on the basis of keys by default , you can customize it using interfaces comparator and comparable

        // to convert the elements within a HashMap into a Set use entrySet method
        System.out.print("\n" + "HashSet elements/objects:  " + hs.entrySet());
        for(Map.Entry<String,String> entry :hs.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.print("\n" + "HashSet elements/objects:  " + key+"value:"+value);
        }

        //output>> HashSet elements/objects:  [2=learning, 3=core, 5=java]



    }
}