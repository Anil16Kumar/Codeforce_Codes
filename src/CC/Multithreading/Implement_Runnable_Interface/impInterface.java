package CC.Multithreading.Implement_Runnable_Interface;

public class impInterface {
    public static void main(String[] args) {
        RunnableInterfaceThread th=new RunnableInterfaceThread(1);
        Thread t1=new Thread(th);
        RunnableInterfaceThread th1=new RunnableInterfaceThread(2);
        Thread t2=new Thread(th1);
        t1.start();
        t2.start();
    }
}
