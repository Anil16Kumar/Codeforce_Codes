package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ABCgame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],String> function=Arr->{
            return (Arr[0]+Arr[1]+Arr[2])%2==0?"Second":"First";
        };
        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(function.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
