package CC.Collection;
class counter{
    int count=0;
    public synchronized void increment(){
        count++;
    }
}
public class raceConPrac {
    public static void main(String[] args) {
        counter c=new counter();

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
        try{
            t1.join();
            t2.join();
        }catch (Exception exp){
            System.out.println(exp.getMessage());
        }

        System.out.println(c.count);
    }


}
