package CC;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.stream.IntStream;

public class BigBull {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        BiFunction<Integer, Integer, Integer> diff = (a, b) -> b - a;

        while(t--!=0){
            int n=scanner.nextInt();
            int m=scanner.nextInt();
            int val=diff.apply(n,m);
            System.out.println(val == 0 ? "NEUTRAL" : val < 0 ? "LOSS" : "PROFIT");
        }
//        int val = IntStream.range(0, t)
//                .map(i -> diff.apply(scanner.nextInt(), scanner.nextInt()))
//                .sum();

    }
}
