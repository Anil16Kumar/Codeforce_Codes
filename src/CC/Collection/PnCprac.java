package CC.Collection;

class SharedData{
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
        while (!hasData) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            System.out.println("Consumer: "+data);
            hasData=false;
            notify();

    }

}

public class PnCprac {
    public static void main(String[] args) {
        SharedData sharedData=new SharedData();

        Thread producer=new Thread(()->{
            for(int i=0;i<5;i++)
                sharedData.Producer(i);
        });

        Thread consumer=new Thread(()->{
           for(int i=0;i<5;i++)
               sharedData.Consumer();
        });

        producer.start();
        consumer.start();
    }
}
