public class ImmutableClassTest
{

    //The instance variable of the class is final i.e. we cannot change the value of it after creating an object.
    //The class is final so we cannot create the subclass.
    //There is no setter methods i.e. we have no option to change the value of the instance variable.


    public static void main(String ar[])
    {
        Employee e1 = new Employee("ABC123");
        Employee e2 = new Employee("ABC12");
        String s1 = e1.getPancardNumber();
        String s2 = e2.getPancardNumber();
        System.out.println("Pancard Numbers: " + s1+" "+s2);
    }
}
final class Employee
{
    final String pancardNumber;
    public Employee(String pancardNumber)
    {
        this.pancardNumber=pancardNumber;
    }
    public String getPancardNumber(){
        return pancardNumber;
    }
}

