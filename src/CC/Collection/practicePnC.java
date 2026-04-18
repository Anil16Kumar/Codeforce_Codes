package CC.Collection;

class sResource{
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
        System.out.println("producer: "+value);
        hasData=true;

        notify();// to notify the consumer
    }

    public synchronized void consumer(){
        while (!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("consumer: "+data);
        hasData=false;
        notify();
    }
}

public class practicePnC {
    public static void main(String[] args) {
        sResource resource=new sResource();

        Thread producer=new Thread(()->{
            for(int i=0;i<5;i++)
                resource.Producer(i);
        });

        Thread consumer=new Thread(()->{
            for(int i=0;i<5;i++)
                resource.consumer();
        });

        producer.start();
        consumer.start();
    }
}
