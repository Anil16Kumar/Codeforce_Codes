package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class PeakStairs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],String> function=arr->{
            return arr[0] < arr[1] && arr[1] < arr[2] ? "STAIR" : arr[0] < arr[1] && arr[1] > arr[2] ? "PEAK" : "NONE";
        };
        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(function.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };
        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
