package CC.Multithreading.sync_imp;

public class Counter {

    private int count=0;

    //yaha shared data access kiye jaa rahe hai...yaha shared resources access aur modifiye kye jaa rahe hai..
    //aur issi part of program ko bolte hai CRITICAL SECTION
    public synchronized void increment(){ //just by adding synchronized keyword in this method, this make sure that ki ek baar me ek hi thread iss method ko access kare
        count++;
    }

    //  synchronized keyword method signature me likhane se pura ka pura method hi synchronized ho jaega,
    //but if we want ki ek block of code hi synchronized ho to hum wo bhi kar sakte hai...
    /*
    public void increment(){
        synchronized (this){ //-> yaha this ka matlab hi ye hai ki iss particular thread ko access karne do...
            count++;
        }
    }
    */

    //synchronized keywords na use karne ke chalte hume random output aa raha the, kyuki wo treads ki relative timing par dependent(threads concurrently run kar rahe hai) the ki kon pahale aa kar iss critical section ko access kar raha hai
    //so this condition ko hi hum bolte hai RACE CONDITION: jab multiple threads shared resource pe kaam kar rahe ho....so to save from race condition we use synchronized keyword......
    //mutual execution: it ensures that multiple threads critical section simultaneously access na kar le

    public int getCount(){
        return count;
    }

}
