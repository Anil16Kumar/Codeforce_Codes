package CC.Multithreading.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class With_Executor_exp_Factorial {
    public static void main(String[] args) {

        long startTime=System.currentTimeMillis();
        ExecutorService executorService= Executors.newFixedThreadPool(9);// yaha par hum no. of threads decide kar kar sakte hai..so agar hum .newFixedThreadPool(3); likhate hai to har thread 3 numbers ko handle karega..equally..
        // aur 3-3 kar ke output me print hoga, so ye reuse ho raha hai threads

        // ab hum iss "executorService" ke help se hi hum saare kaam karege, ab hume threads se koi matlab nahi..ab sab executor dekh lega.
        for(int i=1;i<=10;i++){
            int finalI = i;
            executorService.submit(()->{
                long result=factorial(finalI);// yaha agar sirf 'i' likhe to error aaaega, kyuki 'i' changes ho raha hai
                //hume yaha effective final pass karna hota hai, to har lambda expression usko correct value capture hogi..
                System.out.println(result);
            });
        }

        executorService.shutdown();//program chalata rahe, that is why we shutdowm() method..future me agar ye executor use karna hoga to hum re-use bhi kar sakte hai pool ko..
        System.out.println("total time taken: "+(System.currentTimeMillis()-startTime));
        // uper wale code me hume sirf apna business logic ke baar me hi sochana hai, thread ke baare me nahi....
    }

    public static long factorial(int n){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result=1;
        for(int i=1;i<=n;i++)
            result*=i;
        return result;
    }

    /*
    1. shutdown()
👉 What it does:
Stops accepting new tasks
Allows already submitted tasks to complete
executor.shutdown();
📌 Important:
It does NOT wait
It just initiates shutdown


🧩 2. awaitTermination()
👉 What it does:
Waits for all tasks to finish (after shutdown)
Blocks the current thread
executor.awaitTermination(5, TimeUnit.SECONDS);
📌 Meaning:
Wait max 5 seconds
If all tasks finish → returns true
If timeout happens → returns false

shutdown() → “No more new work”
awaitTermination() → “Wait until all work is done”


    */

}
