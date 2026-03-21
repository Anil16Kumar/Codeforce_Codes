package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class NewYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<Integer,String> function=num->{
            if (num < 2020) return "NO";
            return (num % 2020 <= num / 2020) ? "YES" : "NO";
        };

        Consumer<Scanner> perfromTestCases=sc->{
          int n=sc.nextInt();
            System.out.println(function.apply(n));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));

    }
}
