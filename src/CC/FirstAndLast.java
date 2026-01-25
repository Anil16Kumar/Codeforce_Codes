package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<Integer,Integer> func=num->String.valueOf(Math.abs(num))
                .chars()
                .map(c -> c - '0')
                .findFirst()
                .orElse(0)+num%10;

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
