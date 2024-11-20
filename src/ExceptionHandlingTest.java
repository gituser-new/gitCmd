public class ExceptionHandlingTest {

    //after exception is handled rest of the code is executing normally
    //At a time only one exception occurs and at a time only one catch block is executed.
    //All catch blocks must be ordered from most specific to most general,
    // i.e. catch for ArithmeticException must come before catch for Exception.
    //if we don't maintain the order of exceptions, compile time error comes.like if we define exception class before arithmatic one
    //When any try block does not have a catch block for a particular exception, then the catch block of the outer (parent) try block are checked for that exception,
    // and if it matches, the catch block of outer try block is executed.
    // finally block is always executed whether an exception is handled or not. The finally block follows the try-catch block

    public static void main(String [] args)
    {
        try {
        int[] intArray = {1, 2, 3, 4, 5};

        //System.out.println("It will throw handled exception Array index out of bound" +intArray[8]);
            declareExceptionTest(intArray);

        }
    catch(Exception e){
        System.out.println("exception is caught" + e);
    }

        finally {
            System.out.println("finally block executes");
        }

        System.out.println("\n after exception is handled rest of the code is executing normally");


    }

    public static void declareExceptionTest(int[] intArray) throws ArrayIndexOutOfBoundsException{

        //here this method doesn't handle exception itself and
        // declares it so that the method which is calling it handles it
        System.out.println("It will throw handled exception Array index out of bound" +intArray[9]);


    }
}

//output: exception is caughtjava.lang.ArrayIndexOutOfBoundsException: 8
//another output:
// exception is caught java.lang.ArrayIndexOutOfBoundsException: 9
//finally block executes
//
// after exception is handled rest of the code is executing normally