package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class water {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<Integer,Integer> func=num->num*2;

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
