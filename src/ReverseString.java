public class ReverseString {

    public  static  void  main(String [] args){

        String str ="reverse string reve rev";

        String[] strArray =str.split(" ");

        String rev="";
        for(int i=0;i<strArray.length;i++){
            rev+=strArray[strArray.length-i-1]+" ";
        }
        System.out.println("reversed string:: "+rev);

        StringBuilder sb= new StringBuilder();  //Builder is not synchronized better to use and use
        // append for concatenation
        for(int i=0;i<strArray.length;i++){
            sb.append(strArray[strArray.length-i-1]).append(" "); }
        System.out.println("reversed string using StringBuffer:: "+sb);

        //find the longest common prefix in all the given strings.


    }

}
