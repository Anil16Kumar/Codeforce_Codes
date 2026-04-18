package CC.Multithreading.Locks;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccountL {

    private int balance=100;

    private final Lock lock=new ReentrantLock();

    public void withdrawAmount(int Amount){
        System.out.println(Thread.currentThread().getName()+" process of withdraw amount is started "+Amount);
        /* PART 1:
        if(lock.tryLock()){
        }

        Acquires the lock if it is available and returns immediately with the value true.
        If the lock is not available then this method will return immediately with the value false.

        iss type ke .tryLock() method true/false return karega, kahata hai ki abhi ye thread yaha busy hai to else part me kuchh bhi response return karwa sakte hai..
        */
//--------------
        /* PART 2:
        try {
            if(lock.tryLock(1000, TimeUnit.MILLISECONDS)){
            }
        } catch (InterruptedException e) {
        }

        hum iss tarah se bhi .tryLock(1000, TimeUnit.MILLISECONDS) laga sakte hai, ye fix time ke liye hi wait karega,
        yaha 1000 millisecond yani 1 second me execution ho jae to thik warna me nikalu..

        */
        try {
            if(lock.tryLock(1000,TimeUnit.MILLISECONDS)){// yaha ye condition likh dene se baaki threads ko indefinatly wait nahi karna pad raha..
                if(balance>=Amount){
                    try{
                        System.out.println(Thread.currentThread().getName()+" withdraw is processing.");
                        Thread.sleep(3000);
                        balance-=Amount;
                        System.out.println(Thread.currentThread().getName()+" withdraw completed, Remaning balance: "+balance);

                    }catch (Exception e){
                        Thread.currentThread().interrupt();//ye ek good practice hai taki baaki threads ko paata chal jae ki ye thread interrupt ho gaya hai..
                    }finally {
                        lock.unlock();// humesa unlock karna hi hai wo bhi finally block me hi...
                    }
                }
                else {
                    System.out.println(Thread.currentThread().getName()+" insufficent balance");
                }
            }
            else{
                System.out.println(Thread.currentThread().getName()+" could not acuired the lock, will try again later...");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


    }

}
