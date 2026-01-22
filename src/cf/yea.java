package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class yea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<String,String> func=str->{
          if("yes".equalsIgnoreCase(str)) return "YES";
          else return "NO";
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(sc.next()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
