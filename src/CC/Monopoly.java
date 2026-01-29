package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Monopoly {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[],String> funct=Arr->Arr[0]>Arr[1]+Arr[2]||Arr[1]>Arr[0]+Arr[2]||Arr[2]>Arr[1]+Arr[0]?"Yes":"No";
        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(funct.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
