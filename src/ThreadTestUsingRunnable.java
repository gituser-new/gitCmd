public class ThreadTestUsingRunnable {

    public static void main(String[] args){
        ThreadCls t1= new ThreadCls();
        ThreadCls t2= new ThreadCls();
        Thread t= new Thread(t1); //Using the constructor Thread(Runnable r)
        t.start();
        Thread tt= new Thread(t2);
        tt.start();

        try{
            tt.interrupt();
        }catch(Exception e){System.out.println("Exception handled "+e);} //since we handle the exception, so it will break out the sleeping but will not stop working.

        //If any thread is in sleeping or waiting state (i.e. sleep() or wait() is invoked), calling the interrupt() method on the thread, breaks out the sleeping or waiting state throwing InterruptedException


        //Note: If you are not extending the Thread class, your class object would not be treated as a thread object.
        // So you need to explicitly create the Thread class object.
        //The method sleep() is being used to halt the working of a thread for a given amount of time.
        //As you know well that at a time only one thread is executed.
        // If you sleep a thread for the specified time, the thread scheduler picks up another thread and so on.
    }
}

class ThreadCls implements Runnable{

    public void run(){

        System.out.println("thread is running using runnable implementation");
        for (int i = 0; i < 4; i++) {
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){System.out.println(e);}
            System.out.println("counter " +i);
        }


    }
}

//output: thread is running using runnable implementation
//thread is running using runnable implementation
//counter 0
//counter 0
//counter 1
//counter 1
//counter 2
//counter 2
//counter 3
//counter 3