package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class isValid {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],String> fun=arr->  {
            return arr[0]+arr[1]>=10 || arr[0]+arr[2]>=10 || arr[1]+arr[2]>=10 ?  "YES": "NO";
        };
        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(fun.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };
        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
