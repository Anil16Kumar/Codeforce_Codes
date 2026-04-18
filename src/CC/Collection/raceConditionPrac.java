package CC.Collection;

class Counting{
    int count=0;
    public synchronized void increment(){
        count++;
    }

}

public class raceConditionPrac {
    public static void main(String[] args) {
        Counting c=new Counting();

        Thread t1=new Thread(()->{
           for(int i=0;i<1000;i++)
               c.increment();
        });

        Thread t2=new Thread(()->{
           for(int i=0;i<1000;i++)
               c.increment();
        });

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        System.out.println(c.count);
    }
}
