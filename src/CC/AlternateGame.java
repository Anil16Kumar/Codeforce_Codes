package CC;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class AlternateGame {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<int[], String> function=Arr->{
            if(Arr[2]%Arr[0]==0 && Arr[3]%Arr[1]==0)
                return Math.abs(Arr[2]/Arr[0] - Arr[3]/Arr[1])==1 || Math.abs(Arr[2]/Arr[0] - Arr[3]/Arr[1])==0 ? "Yes" : "No";
            return "No";
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(function.apply(new int[]{sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()}));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
