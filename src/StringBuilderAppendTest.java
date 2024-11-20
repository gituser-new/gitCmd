public class StringBuilderAppendTest {

    public static void main(String[] args){

        StringBuilder s1= new StringBuilder("core");
        StringBuilder s2= new StringBuilder("java");
        //System.out.println(s1.append(s2).toString());  // append method of String buffer and string builder
        System.out.println((String.join(" ",s1,s2)).toString());


         //Note
        // String.join(" ",s1,s2) method. A separator is specified inside quotation marks followed by the String objects or array of String objects.

        //StringBuffer and StringBuilder classes are used for creating mutable strings.


        StringBuffer sb=new StringBuffer("Hello ");
        sb.append("Java");//now original string is changed
        System.out.println(sb);//prints Hello Java

        //StringBuilder is non-synchronized i.e. not thread safe. more efficient than string buffer

    }
}
