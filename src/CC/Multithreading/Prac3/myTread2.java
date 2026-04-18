package CC.Multithreading.Prac3;

public class myTread2 extends Thread{

    public myTread2(String name){
        super(name);
    }

    @Override
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+ " priority-> " +
                    Thread.currentThread().getPriority() +" ,count-> "+i );
            try{
                Thread.sleep(100);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {

        //by default thread ka koi naam nahi hota Thread.currentThread().getName() -> Thread-0, but we can set name as per our choice,
        //by making a constructor(parameterized constructor and pass the name we want in it) in class that extends the Thread,
        //and with the help of super(), pass the  name in it

        myTread2 tread1=new myTread2("___Anil____");

        // also we can even set the priporities of threads as well, like Thread.MIN_PRIORITY(value is 5),
        tread1.setPriority(Thread.MIN_PRIORITY);
        tread1.start();
        //----------------

        myTread2 t1=new myTread2("Lp");
        myTread2 t2=new myTread2("Np");
        myTread2 t3=new myTread2("Hp");
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        //output me ye jarori nahi hai ki MAX_PRIORITY wahi hi pahale chale kyuki ye single core machine nahi hai,
        // yaha koi bhi priority wala thread pahale chal sakta hai

    }
}
