public class ThreadTest  {

    public static void main(String[] args){
        ThreadClass t1= new ThreadClass();
        t1.start();

    }

}

 class ThreadClass extends Thread{

    public void run(){

        System.out.println("thread is running");

    }
}
