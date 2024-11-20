public class ThraedSynchronizedBlocktest {


    //When a thread invokes a synchronized block,
    //Suppose we have 50 lines of code in our method,
    // but we want to synchronize only 5 lines, in such cases, we can use synchronized block.
    //more efficient than Java synchronized method.

    public static void main(String[] args) {

        Thread1 t11= new Thread1();
        t11.start();
        Thread2 t12= new Thread2();
        t12.start();
    }

}

class Countr {
    void printCounter(int count) {
        synchronized (this) {  // with static method we need to use like this synchronized (Countr.class)
            for (int i = 1; i <= count; i++) {
                System.out.println(i);
            }

        }
    }
}

class Thread11 extends Thread
{
    Countr c = new Countr();
    public void run(){
        c.printCounter(5);
    }
}

class Thread12 extends Thread
{
    Countr c;
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