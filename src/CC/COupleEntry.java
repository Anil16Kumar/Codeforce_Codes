package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class COupleEntry {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();

        Function<int[], Integer> fun= Arr->Arr[1]-Arr[0];

        Consumer<Scanner> perfromTestCases= sc->{
            System.out.println(fun.apply(new int[]{sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,t).forEach(i->perfromTestCases.accept(scanner));

    }
}
