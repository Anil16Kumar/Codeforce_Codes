package cf;

import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class CalulationFunction {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Long n=scanner.nextLong();
        Function<Long, Long> fun=(num)->num%2==0?num/2:-((num+1)/2);
        System.out.println(fun.apply(n));
    }
}
