package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class TeamDistribution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        Function<Integer,Integer> func=num-> num<=3?num:num%2;

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(sc.nextInt()));
        };

        IntStream.range(0,t).forEach(i->perfromTestCases.accept(scanner));
    }
}
