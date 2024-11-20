import java.util.HashSet;
import java.util.Iterator;

import static jdk.nashorn.internal.objects.NativeArray.forEach;

public class HashSetTest {


 public static void main(String[] args){

  HashSet <String >hs= new HashSet<String>();
  hs.add("java");
  hs.add("core");
  hs.add("learning");
  hs.add(null);
  hs.add(null);

  System.out.print("HashSet elements/objects:  " + hs + "\n" + hs.contains("java"));

  //o/t >HashSet elements/objects:  [null, core, java, learning]

  //The HashSet object allows null values but, you can add only one null element to it.
  // Though you add more null values if you try to print its contents, it displays only one null.


/*
  for (String s :hs){
   System.out.print("\n " + "HashSet elements/objects using iterator:  " + s);
  }
*/

 /* Iterator is = hs.iterator();
  while(is.hasNext()) {
   Object s = is.next();
   System.out.print("\n " + "HashSet elements/objects using iterator:  " + s);
  }*/
  //using foreach
  hs.forEach(System.out::println);




}}

