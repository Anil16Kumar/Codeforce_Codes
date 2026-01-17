package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class WhoWin {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<Integer,String> func=num->num%3==0 ? "Second":"First";

        Consumer<Scanner> performTestCases=sc->{
            System.out.println(func.apply(sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->performTestCases.accept(scanner));
    }
}
