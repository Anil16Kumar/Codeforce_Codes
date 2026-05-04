package CC.Collection;

class Task extends Thread{
    StringBuffer sb;
    public Task(StringBuffer sb){
        this.sb=sb;
    }

    @Override
    public void run(){
        for(int i=0;i<1000;i++)
            sb.append("a");
    }
}
public class StringStringBuilderStringBuffer {
    //Java String vs StringBuilder vs StringBuffer -> teeno hi sequence of characters ko store karne me kaam aati hai
    public static void main(String[] args) throws Exception{

        StringBuffer sb=new StringBuffer();

        Task t1=new Task(sb);
        Task t2=new Task(sb);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("length of string: "+sb.length());

    }
}
