public class ThreadSynchronizationTest {

   //When a thread invokes a synchronized method,
    // it automatically acquires the lock for that object and releases it when the thread completes its task.

    public static void main(String[] args) {

        Thread1 t1= new Thread1();
        t1.start();
        Thread2 t2= new Thread2();
        t2.start();
    }

}

class Counter{

    //If you make any static method as synchronized, the lock will be on the class not on object.
    synchronized static void printCounter(int count){
        for (int i = 1; i <=count ; i++) {
            System.out.println(i);
        }

    }
}


class Thread1 extends Thread
{
    Counter c;
    public void run(){
    c.printCounter(5);
    }
}

class Thread2 extends Thread
{
    Counter c;
    public void run(){
        c.printCounter(10);
    }
}

//output: 1
//2
//3
//4
//5
//1
//2
//3
//4
//5
//6
//7
//8
//9