package cf;

import java.util.Scanner;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.IntStream;

public class AorB {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        BiConsumer<Integer,Integer> biConsumer=(a,b)->{
            System.out.println( a<b? a+" "+b:b+" "+a );
        };

        Consumer<Scanner> perfromTestCases=sc->{
          biConsumer.accept(sc.nextInt(),sc.nextInt());
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
