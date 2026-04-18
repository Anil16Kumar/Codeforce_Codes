package CC.Multithreading.prac1;

public class secondThread_imliments_Runable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("world");
    }
}
