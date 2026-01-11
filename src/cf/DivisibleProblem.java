package cf;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class DivisibleProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        BiFunction<Integer,Integer,Integer> bfunc=(n1,n2)->n1%n2==0?0:n2-(n1%n2);

        Consumer<Scanner> perfromTestCases=sc->{
            int num=sc.nextInt();
            int num2=sc.nextInt();
            System.out.println(bfunc.apply(num,num2));
        };

        IntStream.range(0,t).forEach(i->perfromTestCases.accept(scanner));
    }
}
