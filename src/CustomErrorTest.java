public class CustomErrorTest {

    // https://www.javatpoint.com/custom-exception. good details

    //throw keyword is used to throw an exception explicitly.We can throw either checked or unchecked exception.
    //The throw statement allows you to create a custom error.
    // note by default checked exceptions are not propagated so better t handle it where its happening
    public static void main(String [] args){

        try {
            checkAge(5);
        }
        catch(ArithmeticException e)
        {
            System.out.println("unchecked custom exception is caught");
        }

        try{
            // // throwing an object of user defined exception
            throw new CustomExceptionForAgeCheck("user defined exception is caught");
        }
        catch(CustomExceptionForAgeCheck e){

            System.out.println(e.getMessage());
        }

    }

    public static void checkAge(int age){

        if(age<18){

            throw new ArithmeticException ("access denied, age is less");
        }

    }




}
