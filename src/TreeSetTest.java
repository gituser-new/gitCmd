import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<>();
        ArrayList<String> as= new ArrayList<>();
        as.add("one");
        as.add("two");
        as.add("two");   /// doesn't stores duplicates. its a set of unique elements
       // as.add(null); //doesn't allow null as internally calls comparable interface for sorting
        as.add("three");
        ts.addAll(as);
        System.out.println(ts);
    }
}
