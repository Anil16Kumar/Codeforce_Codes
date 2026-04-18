package CC.Multithreading.prac2;

public class MyThread_imp_lifecycle extends Thread{

    @Override
    public void run(){
        System.out.println("running state of thread ");

        try {
            Thread.sleep(2000); //here we cannot throws InterruptedException, because this method is override,
            // so that method is not throws any exception so this cannot also.. so that is why we should surround this with try-catch block...
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        MyThread_imp_lifecycle t1 = new MyThread_imp_lifecycle();
        System.out.println(t1.getState()); //->NEW
        t1.start();
        System.out.println(t1.getState());//->RUNNABLE

//        System.out.println(Thread.currentThread().getName());//-> this is main thread
        Thread.sleep(100);//-> ye main thread ko bol raha hai ki 100 millisecond ke liye roko....
        //shows error so we need to throws InterruptedException exeption in method segnature or surround it with try-catch block..
        System.out.println(t1.getState());//-> TIMED_WAITING

        t1.join();//jis par ye call laga rahe ho usko finish hone ka wait kar raha hai main thread.
        //issko chala raha hai main thread, so main method will wait for t1 to finish
        //i.e, jab tak t1 kaam kar raha hai tab tak wait karega main thread/method..

        System.out.println(t1.getState());//->line ka execution yaha tak aa gaya iska matlab t1 ka kaam pura ho gaya hai,
        //i.e, TERMINATED...


        /*
        *
            A thread goes through different states during its execution:

           1. New
Thread is created but not started
Thread t = new Thread();

            2. Runnable
After calling start(), thread is ready to run
Waiting for CPU

            3. Running
Thread is executing (CPU is assigned)

            4. Waiting / Blocked / Timed Waiting
Thread is paused temporarily:
sleep() → Timed waiting
wait() → Waiting
Waiting for lock → Blocked

             5. Terminated (Dead)
Thread has finished execution or stopped

                Flow
New → Runnable → Running → Waiting/Blocked → Runnable → Running → Terminated

        A thread life cycle includes New, Runnable, Running, Waiting/Blocked,
        and Terminated states representing its execution from creation to completion.

        * */



    }
}
