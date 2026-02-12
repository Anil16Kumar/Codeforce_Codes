package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class carSpeed {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[], String> func = arr -> {
            int U = arr[0];
            int V = arr[1];
            int A = arr[2];
            int S = arr[3];

            return (U*U - 2*A*S <= V*V) ? "Yes" : "No";
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };
        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
