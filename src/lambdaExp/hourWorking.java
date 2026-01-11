package lambdaExp;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class hourWorking {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        BiPredicate<Integer,Integer> biPredicate=(n1,n2)->n1>n2;

        BiFunction<Integer,Integer,Integer> biFun=(a,b)->b-a;

        Consumer<Scanner> perfromForEachTestCases=sc->{
          int n=sc.nextInt();
          int m=sc.nextInt();
            System.out.println();
        };

        IntStream.range(0,t).forEach(i->perfromForEachTestCases.accept(scanner));
        System.out.println(biPredicate.test(1,3));

        BiFunction<Integer,Integer,String> bifun=(n,m)->{
             if(n>=m) return "YES";
             else return "NO";
        };

        Consumer<Scanner> perfromAllTestCases=sc->{
            int n=sc.nextInt();
            int m=sc.nextInt();
            System.out.println(bifun.apply(n,m));
        };

        IntStream.range(0,t).forEach(i->perfromAllTestCases.accept(scanner));
    }
}
