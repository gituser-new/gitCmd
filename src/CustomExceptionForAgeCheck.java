public class CustomExceptionForAgeCheck extends Exception{

    public CustomExceptionForAgeCheck(String str)
    {
        //// Calling constructor of parent Exception
        super(str);
    }

}
