package Thread;

public class nameThread {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        sampleClass aClass=new sampleClass();
        Thread thread=new Thread(aClass);
        thread.start();
        while(true){
            System.out.println("hello");
        }
    }
}
