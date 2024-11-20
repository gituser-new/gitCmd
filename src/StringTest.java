public class StringTest {

    //String objects are stored in a special memory area known as the "string constant pool".
    //Each time you create a string literal(String s="java"), the JVM checks the "string constant pool" first. If the string already exists in the pool, a reference to the pooled instance is returned. If the string doesn't exist in the pool, a new string instance is created and placed in the pool.
    // To make Java more memory efficient we use literals
    public static void main(String[] args)
    {
        char [] charArray= {'a','b','c','d','e','f'};
        String s= new String(charArray);
        System.out.println("String is " +s);

        String s1= new String("core");///creates two objects (new string and welcome )and one reference variable which is s
        String s2= new String("core");
        String s3= "java";
        String s4="java";


        if(s1==s2)
        {
            System.out.println("String reference is equal");
        }
        if(s1.equals(s2))
        {
            System.out.println("String is equal");
        }
        else{
            System.out.println("String is not equal");
        }
        if(s4==s3)// The == operator compares references not values.note it should be literals.
        {
            System.out.println("reference is equal");
        }
        else{
            System.out.println("reference is not equal"+s3+" "+s4);
        }

    }
}
