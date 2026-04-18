package CC.Multithreading.prac1;

public class firstThread_Extends_Thread extends Thread{

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());

    }

}
