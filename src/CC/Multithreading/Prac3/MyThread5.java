package CC.Multithreading.Prac3;

public class MyThread5 extends Thread{

    @Override
    public void run(){

        while(true){
            System.out.println("hello world...");
        }

    }

    public static void main(String[] args) {
        MyThread5 t1=new MyThread5();// these created threads(t1) are called the user thread, jo humara kaam kar raha hai,
        // jo humare kaam karwate hai usse hum usse user thread kehate hai
        t1.setDaemon(true);
        MyThread5 t2=new MyThread5();// here t2 is a user thread
        t2.start();// t2 ek user thread hai to JVM will wait for t2 to finish..
        t1.start();
        System.out.println("main done");


        //DAEMON THREADS -> ye wo threads hai jo background me chalte hai..
        //jaise java me garbage collector, JVM daemon threads ke liye wait nahi karta


    }
}
