import org.jetbrains.annotations.NotNull;
import sun.font.CreatedFontTracker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparableTest {

    public static void main(String[] args) {

        ArrayList<Student> al = new ArrayList<>();
        Student student1 = new Student("Rashi", "35");
        Student student2 = new Student("Kartik", "37");
        Student student3 = new Student("Shuntoo", "1");
        al.add(student1);
        al.add(student2);
        al.add(student3);

        Collections.sort(al);
        System.out.println("list is sorted based on age using comparable:: "+ al.toString());


        Collections.sort(al,Student.NameComparator);
        System.out.println("list is sorted based on name using comparator: "+ al.toString());


    }
}
class Student implements Comparable<Student> {

    String name;
    String age;

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student student) {
        //System.out.println(this.age +" " +student.getAge() +"\n");


        //let's sort the age in ascending order. This is kind of default sorting
        //returns a negative integer, zero, or a positive integer as this age
        //is less than, equal to, or greater than the specified object.
        return Integer.parseInt(this.age)-Integer.parseInt(student.getAge());
    }

    /**
     * Comparator to sort student list in order of Name
     */
    public static Comparator<Student> NameComparator = new Comparator<Student>() {

        @Override
        public int compare(Student e1, Student e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };

    @Override
    //this is required to print the user-friendly information about the Student
    public String toString() {
        return "[name=" + this.name + ", age=" + this.age + "]";
    }
}
