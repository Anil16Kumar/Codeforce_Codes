package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class OddDivisor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<Long,String> funct=num->(num&(num-1))==0?"NO":"YES";

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(funct.apply(sc.nextLong()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
