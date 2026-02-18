package cf;

import java.util.Scanner;

public class MishkaAndGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int time=scanner.nextInt();
        int ct=0,mt=0;
        while(time--!=0){
            int Mishka=scanner.nextInt();
            int Chris=scanner.nextInt();
            if(Mishka>Chris)
                mt++;
            else if(Mishka<Chris)
                ct++;
        }

        System.out.println(mt==ct?"Friendship is magic!^^":mt>ct?"Mishka":"Chris");

//        Function<int[],String> function=(Arr)->{
//          int Mishka=0, Chris=0;
//
//        };
//
//        Consumer<Scanner> perfromNumberOfTime=sc->{
//            System.out.println(function.apply(new int[]{sc.nextInt(),sc.nextInt()}));
//        };
//
//        IntStream.range(0,scanner.nextInt()).forEach(i->perfromNumberOfTime.accept(scanner));
    }
}
