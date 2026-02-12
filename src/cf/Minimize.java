package cf;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class Minimize {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        BiFunction<Integer,Integer,Integer> bifunction=(num1,num2)->{
            return ((num1+num2)/2 - num1) + (  num2 - (num1+num2)/2);
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(bifunction.apply(sc.nextInt(),sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));

    }
}
