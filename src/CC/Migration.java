package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Migration {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],Integer> func=Arr->(Arr[0]-Arr[1])+Arr[2];
        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(func.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };
//        System.out.println(Math.min(1,2));
        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
