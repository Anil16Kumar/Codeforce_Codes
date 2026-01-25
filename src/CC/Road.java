package CC;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Road {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiFunction<Integer,Integer,Integer> biFun=(num1,num2)->num1*2 + num2*4;
        Consumer<Scanner> performTestCases=sc->{
            System.out.println(biFun.apply(sc.nextInt(),sc.nextInt()));
        };
        IntStream.range(0,scanner.nextInt()).forEach(i->performTestCases.accept(scanner));
    }
}
