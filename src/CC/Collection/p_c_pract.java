package CC.Collection;
class sharedData{
    private int data;
    private boolean hasData=false;

    public synchronized void Producer(int value){
        while(hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        data=value;
        System.out.println("Producer: "+value);
        hasData=true;
        notify();

    }

    public synchronized void Consumer(){
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        hasData=false;
        System.out.println("Consumer: "+data);
        notify();
    }

}
public class p_c_pract {
    public static void main(String[] args) {
        sharedData sharedData=new sharedData();
        Thread Producer=new Thread(()->{
            for(int i=0;i<5;i++)
                sharedData.Producer(i);
        });

        Thread Consumer=new Thread(()->{
            for(int i=0;i<5;i++)
                sharedData.Consumer();
        });

        Producer.start();
        Consumer.start();

    }
}
