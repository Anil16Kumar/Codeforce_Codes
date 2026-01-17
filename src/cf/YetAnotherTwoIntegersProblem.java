package cf;

import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class YetAnotherTwoIntegersProblem {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        BiFunction<Long,Long,Long> func=(num1, num2)->{
          long val= Math.abs(num1-num2);
          return (val+9)/10;
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(sc.nextLong(),sc.nextLong()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
