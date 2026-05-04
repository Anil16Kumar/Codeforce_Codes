package CC.Collection;

class ThreadSample extends Thread{
    Integer ThreadNumber;
    public ThreadSample(Integer ThreadNumber){
        this.ThreadNumber=ThreadNumber;
    }
    @Override
    public void run(){
        for(int i=0;i<3;i++){
            System.out.println("Running Thread: "+ThreadNumber);
            try {
                Thread.sleep(2000);
            }catch (Exception exp){
                System.out.println(exp.getMessage());
            }
        }
    }
}

public class ThreadPrac {
    public static void main(String[] args) {
        ThreadSample t1=new ThreadSample(1);
        ThreadSample t2=new ThreadSample(2);
        ThreadSample t3=new ThreadSample(3);
        t1.start();
        t2.start();
        t3.start();

    }
}
