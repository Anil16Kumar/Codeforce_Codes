package CC;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class MaimeiSP {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiFunction<Integer,Integer,String> func=(num1,num2)->num1*1.07>=num2?"Yes":"No";

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(sc.nextInt(),sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
