package CC.Multithreading.Prac3;

public class myThread3 extends Thread{

    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            System.out.println("thread is running..");
        }catch (Exception e){
            System.out.println("Thread is interrupted: "+e);
        }
    }

    public static void main(String[] args) {

        myThread3 t1=new myThread3();
        t1.start();
        t1.interrupt();// jo ye thread chal rahi hai usko interrupt kar do, i.e, rok do wo jo bhi kaam kar raha hai..

    }
}
