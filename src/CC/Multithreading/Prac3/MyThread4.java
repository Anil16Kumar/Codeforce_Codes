package CC.Multithreading.Prac3;


public class MyThread4 extends Thread{

    public MyThread4(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++) {
            System.out.println(Thread.currentThread().getName() + " is running");
            Thread.yield();// har ek itration ke baad hum scedular ko bolege ki aap dusaare thread ko chance de dijiye
            //A hint to the scheduler that the current thread is willing to yield its current use of a processor.
            // The scheduler is free to ignore this hint.
            // same issi tarah setPriority me bhi hum hint hi dete hai
        }
    }

    public static void main(String[] args) {
        MyThread4 t1=new MyThread4("ABCD");
        MyThread4 t2=new MyThread4("XYZ");
        t1.start();
        t2.start();
    }
}
