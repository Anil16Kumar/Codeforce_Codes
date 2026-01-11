package CC;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class ChairRemaning {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        BiFunction<Integer,Integer,Integer> bfun=(n1,n2)->n2>=n1?0:n1-n2;

        Consumer<Scanner> perfromTestCase=sc->{
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println(bfun.apply(num1,num2));
        };

        IntStream.range(0,t).forEach(i->perfromTestCase.accept(scanner));
    }
}
