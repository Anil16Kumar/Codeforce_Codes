package CC.Multithreading.ThreadNumber_Extend_Thread_class;

public class tNum {
    public static void main(String[] args) {
        ThreadWithNumber thread=new ThreadWithNumber(1);
        ThreadWithNumber thread1=new ThreadWithNumber(2);
        thread.start();
        thread1.start();

        for(int i=3;i<=5;i++){
            ThreadWithNumber thread2=new ThreadWithNumber(i);
            thread2.start();
        }

        // all these above 5 threads are running at the same time, there might be difference in position they come on console..
        // even if any exception occurs in any of the threads, all others will be running as usually.
        // that is even the main thread went into some trouble all these other thread will be running fine, because they all are running independently

    }
}
