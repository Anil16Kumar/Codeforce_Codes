package CC.Multithreading.prac1;

public class pracMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        firstThread_Extends_Thread thread=new firstThread_Extends_Thread();
        thread.start();

        //jab implements wale se thread create karege to iss tarah se hum thread create karte hai :-
        secondThread_imliments_Runable runable=new secondThread_imliments_Runable();
        Thread thread1=new Thread(runable);
        thread1.start();

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
