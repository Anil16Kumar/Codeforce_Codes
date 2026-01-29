package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class AgainApB {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Function<Integer,Integer> sumInt=num->{
            int sum=0;
            while(num!=0){
                sum+=num%10;
                num/=10;
            }
            return sum;
        };

        Consumer<Scanner> perfromTestCases=sc->{
            System.out.println(sumInt.apply(sc.nextInt()));
        };

        IntStream.range(0,scanner.nextInt()).forEach(i->perfromTestCases.accept(scanner));
    }
}
