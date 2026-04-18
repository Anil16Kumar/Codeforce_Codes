package CC.Multithreading.sync_imp;

public class Syncronization {
    public static void main(String[] args) {
            Counter counter=new Counter();// yaha par hum ek hi object ko share kar rahe hai between multiple threads,
            // so because of that humare result consistent nahi hoga, humesha value badalti rahegi..
            // jo actual method ko jo dono access kar rahe hai wo hai increment(), so we need to make this method syncronyzed,
            //just by adding synconized keyword in the common method access by both the threads will be fine, this keyword make sure ki ek baar me ek bhi thread is method increment() ko access kare

            MyThread t1=new MyThread(counter);
            MyThread t2=new MyThread(counter);
            t1.start();
            t2.start();

            try{ // and to make sure ki ye dono thread finish ho jae, we'll be using .join() method, uske baad hum print karege ki end me kitna result aaya
                t1.join();
                t2.join();
            }catch (Exception e){
                System.out.println(e);
            }

            System.out.println(counter.getCount());


    }
}
