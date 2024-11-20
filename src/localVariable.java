

// Java Program to demonstrate use of Encapsulation this is not the example of local variable
import java.io.*;
class localVariable {
    private String Name;
    private int age;
    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}
// Driver class
class GFG {
    // main function
    public static void main(String[] args)
    {
        localVariable p = new localVariable();
        p.setName("Rohan");
        p.setAge(29);
        System.out.println("Name is " + p.getName());
        System.out.println("Age is " + p.getAge());
    }
}
