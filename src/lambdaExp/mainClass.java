package lambdaExp;

public class mainClass {
    public static void main(String[] args) {
        Runnable runnable=()->{
            for(int i=0;i<10;i++)
                System.out.println("main class: "+i);
        };
        Thread thread=new Thread(runnable);
        thread.run();

    }
}
