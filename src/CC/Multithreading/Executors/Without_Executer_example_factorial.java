package CC.Multithreading.Executors;

public class Without_Executer_example_factorial {

    public static void main(String[] args) {

        //yaha par hum synchronously factorial calculate kar rahe hai..
        long startTime=System.currentTimeMillis();
        for(int i=1;i<=10;i++){
            System.out.println(factorial(i));
        }
        //add 1 sec time sleep in factorial function explicitly, to see how much time required in synchronously
        // then we will compare it with executor method time diff..
        System.out.println("Total time: "+(System.currentTimeMillis()-startTime));
        //Total time: 10088 because we are calling synchronously time is showing high....

        //----------------------
        // now we will use threads to calculate the time difference

        long startTime1=System.currentTimeMillis();
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            Thread thread=new Thread(
                    ()->{
                        long result=factorial(finalI);// yaha agar sirf 'i' likhe to error aaaega, kyuki 'i' changes ho raha hai
                        //hume yaha effective final pass karna hota hai, to har lambda expression usko correct value capture hogi..
                        System.out.println(result);
                    }
            );
            thread.start();
        }
        System.out.println("Total time using threads: "+(System.currentTimeMillis()-startTime1));
        //Total time using threads: 4 ye pahale hi show kar de raha hai iska matlab ye time sahi nahi hai kyuki hume thread ka to wait hi nahi kiya pura chale tak ka ya finish hone tak ...
        //ye jo uper time hai to thread creation hai na ki pure threads execution ka...to hume wait karna padega pure threads ko completely finish hone tak ke liye...

        //---------------------

        long startTime2=System.currentTimeMillis();
        Thread threads[]=new Thread[10];
        for (int i = 1; i <= 10; i++) {
            int finalI = i;
            threads[i-1]=new Thread(
                    ()->{
                        long result=factorial(finalI);// yaha agar sirf 'i' likhe to error aaaega, kyuki 'i' changes ho raha hai
                        //hume yaha effective final pass karna hota hai, to har lambda expression usko correct value capture hogi..
                        System.out.println(result);
                    }
            );
            threads[i-1].start();
        }

        //yaha hum wait kar rahe hai har thread ka, to finish
        for(Thread thread1:threads){
            try {
                thread1.join();
            }catch (InterruptedException e){
                Thread.currentThread().interrupt();
            }
        }

        System.out.println("Total time using thread array: "+(System.currentTimeMillis()-startTime2));
        //Total time using thread array: 1011, this is the real time taken by the program to calculate the factorial using multithreading...

        /*

        from above we conculted the advntage of using multithreading,
        so for that to calculate factorial from 1 - 10 we have create 10 threads
        here we are creating the threads and also doing our main business logic as well...that is why we have introduced the executer
        so executors says: aap apna business logic par dhyan do ye multithreading wala kaam me kar luga...
        aur yaha hum threads reuse bhi nahi kar rahe, hume 10 threads create kar diye for 1-10 factorials, but in executors we will also reuse the threads as well..

        * */
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
}
