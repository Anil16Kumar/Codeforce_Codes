package Thread;

public class oneSecondGap extends Thread{
    @Override
    public void run() {
        for(int i=1;i<=5;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        oneSecondGap secondGap=new oneSecondGap();
        secondGap.start();
    }
}
