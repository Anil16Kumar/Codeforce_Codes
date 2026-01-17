package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Course {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],Integer> func=(Arr)->Arr[0]<=Arr[1] ? Math.abs(Arr[1]-Arr[0]) : 0;

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(new int[]{sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
