package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Blood {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<Integer,String> funct=num->num<=3?"BRONZE":num>3 && num<=6 ? "SILVER":"GOLD";

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(funct.apply(sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }


}
