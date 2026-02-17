package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class string3sort {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<String,String> function=(str)->{
           return  str.charAt(0)=='a' || str.charAt(1)=='b' || str.charAt(2)=='c' ?    "YES" :  "NO";
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(function.apply(sc.next()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
