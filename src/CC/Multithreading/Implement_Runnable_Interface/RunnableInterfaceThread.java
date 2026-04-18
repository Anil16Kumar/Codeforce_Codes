package CC.Multithreading.Implement_Runnable_Interface;

public class RunnableInterfaceThread implements Runnable{

    private int threadNumber;

    public RunnableInterfaceThread(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run() {
        for(int i=0;i<5;i++){
            System.out.println(i+" -> this thread is running on thread number: "+threadNumber);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
