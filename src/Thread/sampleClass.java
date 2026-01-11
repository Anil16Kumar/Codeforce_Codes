package Thread;

public class sampleClass implements Runnable{
    @Override
    public void run() {
        while(true)
                System.out.println("world");
    }
}
