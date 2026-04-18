package CC.Multithreading.ThreadNumber_Extend_Thread_class;

public class ThreadWithNumber extends Thread{

    private int threadNumber;

    public ThreadWithNumber(int threadNumber){
        this.threadNumber=threadNumber;
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i+" -> is running on thread: "+threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println();
    }
}
