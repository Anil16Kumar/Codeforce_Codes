package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class OddOneOut {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        Function<int[], Integer> fun=arr->arr[0]^arr[1]^arr[2];

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(fun.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,t).forEach(i->perfromTestCases.accept(scanner));
    }
}
