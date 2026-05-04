package CC.Multithreading.Locks;

public class Mainlok {
    public static void main(String[] args) {
        //locks are used to control access to shared resources and avoid issues like race conditions.

        //Intrinsic locks are simple, JVM-managed locks using synchronized,
        // while Explicit locks (like ReentrantLock) provide more flexible and advanced control over thread synchronization.

//        BankAccount bankAccount=new BankAccount();
        BankAccountL bankAccount=new BankAccountL(); //Lock is used

        //interface ka koi object to nahi baega, so we have made a annonimus class
        Runnable task=new Runnable() {
            @Override
            public void run() {
                bankAccount.withdrawAmount(50);
            }
        };// yaha thread class ka na istemal kar ke, hum runnable interface ka use kar rahe hai...

        Thread t1=new Thread(task,"thread 1");
        Thread t2=new Thread(task,"thread 2");
        t1.start();
        t2.start();


    }
}
