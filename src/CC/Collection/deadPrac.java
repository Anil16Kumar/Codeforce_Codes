package CC.Collection;


public class deadPrac {
    private static final Object lock1=new Object();
    private static final Object lock2=new Object();
    public static void main(String[] args) {

            Thread t1=new Thread(()->{
                synchronized (lock1){
                    System.out.println("Thread 1 acqured lock 1");
                    try {
                        Thread.sleep(2000);
                    }catch (Exception exp){
                        System.out.println(exp.getMessage());
                    }
                    synchronized (lock2){
                        System.out.println("Thread 1 acqured lock 2");
                    }
                }
            });

            Thread t2=new Thread(()->{
                synchronized (lock1){
                    System.out.println("Thread 2 acquired lock 1");
                    try{
                        Thread.sleep(2000);
                    }catch (Exception exp){
                        System.out.println(exp.getMessage());
                    }

                    synchronized (lock2){
                        System.out.println("Thread 2 acquired lock 2");
                    }
                }
            });

            t1.start();
            t2.start();

    }
}
