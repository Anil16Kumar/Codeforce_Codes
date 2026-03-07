package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ApB {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<String,Integer> function=(exp)->{
           return exp.charAt(0)-'0' + exp.charAt(2)-'0';
        };

        Consumer<Scanner> perfromTestCases=sc->{
          String exp=sc.next();
            System.out.println(function.apply(exp));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
