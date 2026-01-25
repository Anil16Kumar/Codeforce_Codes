package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class SumInteger {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<Integer,Integer> sumOfNum=num->String.valueOf(num)
                .chars()
                .map(c->c-'0')
                .sum();

        Consumer<Scanner> perfromTestCases= sc->{
            System.out.println(sumOfNum.apply(sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
