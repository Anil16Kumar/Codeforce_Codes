package CC.Collection;

import java.util.concurrent.atomic.AtomicInteger;

class CounterClass{
    int count=0;//AtomicInteger count=new AtomicInteger(0);
    synchronized public void increment(){
        count++;//count.incrementAndGet();
    }
}
public class PracRaceConditionResolve {
    public static void main(String[] args) throws Exception{
        CounterClass aClass=new CounterClass();
        Thread t1=new Thread(()->{
            for(int i=0;i<1000;i++)
                aClass.increment();
        });

        Thread t2=new Thread(()->{
            for(int i=0;i<1000;i++)
                aClass.increment();
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(aClass.count);
    }
}
