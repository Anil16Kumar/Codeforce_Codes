package CC.Multithreading.MultithreadingLambda;

public class LambdaExpression {
    public static void main(String[] args) {
        /*
        that is how we normally use to make thread as of now:-> this is anonymous new Runable() class,
        here we have created class anonymously on the fly implementaion class ban gai hai aur uska object bhi create ho gaya h
        humne immplimentaion class na create kar ke anonymous class create kar liya hai....

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                System.out.println("inside the thread");
            }
        };
        Thread thread=new Thread(runnable);
        thread.start();

        but we can create this in more easy manner....just by replacing it with lambda
        */

        Runnable runnable=()-> System.out.println("inside the thread");
        Thread t1=new Thread(runnable);
        t1.start();

        // aisa interface jike aandar single abstract method hota hai unko hum bolte hai functional interface
        // interface ->single abstract method(SAM) -> functional interface
        // so humara Runnable ek functional interface hai...

        //Lambda expression -> hota hai anonymous function

        Runnable runnable1=()->{
            System.out.println("inside thread 2 run() method"); // Runnable ek functional interface hai, to jo bhi hum {} ke aandar likhege wo run() method me hi hoga..
        };
        Thread t2=new Thread(runnable1);
        t2.start();


        //we can even write it more shorter way:

        Runnable runnable2=()->System.out.println("inside thread 3 run() method");
        Thread t3=new Thread(runnable2);
        t3.start();

        // the runnable which we are writing inside this new Thread(), can be replaced with entire exprestion,

        Thread t4=new Thread(()->System.out.println("inside thread 4 run() method"));
        t4.start();
        // here are create the thread in the most simplest manner,
        // no need to create implementation, anonymous class, just directly use the lambda expresstion and done

        Thread t5=new Thread(() -> {
           for(int i=0;i<10;i++)
               System.out.println("hello "+i);
        });// for writing multiple line inside the lambda expression
        t5.start();






    }
}
