package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Health {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        Predicate<Integer> pre=(num)->num>98;

        Function<Integer,String> func=(num)->pre.test(num)?"YES":"NO";

        Consumer<Scanner> perfromTestCases=(sc)->{
            System.out.println(func.apply(sc.nextInt()));
        };

        IntStream.range(0,t).forEach(i->perfromTestCases.accept(scanner));

    }
}
