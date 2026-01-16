package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class inflation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Predicate<int[]> pred=Arr->Arr[0]>=Arr[1]*2;
        Consumer<Scanner> perfromTestCases=(sc)->{
            System.out.println(pred.test(new int[]{sc.nextInt(),sc.nextInt()})?"Yes":"No");
        };
        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
