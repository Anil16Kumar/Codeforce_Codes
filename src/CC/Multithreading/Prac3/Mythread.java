package CC.Multithreading.Prac3;

public class Mythread extends Thread{

    @Override
    public void run(){
        System.out.println("inside created thread, doing the task");
        /*
        for(int i=0;i<5;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);//jab bhi hum Thread likhate hai wo current thread ko point karta hai,
                // is case me jab humne Thread.sleep(2000) likha to wo iss particular tread ko point karne lagata hai, main thread ko nahi
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        */

       /*
       try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */
    }

    public static void main(String[] args) throws InterruptedException {
        Mythread mythread=new Mythread();
        mythread.start();// this start() calls the run() for us by JVM
        //mythread.join();// jo bhi iss mythread ko call kar raha hai,
        // wo wait karega mythread ke finish hone ka, isse call kar raha hai main thread, so main thread will wait for mythread to finish

        mythread.join();
        //inside run() of thread written following code:
        /*
       try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        */
        //so the below code of main() will execute after 5 second
        System.out.println("Hello from main");
    }
}
