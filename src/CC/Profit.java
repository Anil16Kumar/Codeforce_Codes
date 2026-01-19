package CC;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Profit {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiFunction<Integer,Integer,Integer> biFun=(num1,num2)->(num1+num1/10) - (num1-num2);

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(biFun.apply(sc.nextInt(),sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
