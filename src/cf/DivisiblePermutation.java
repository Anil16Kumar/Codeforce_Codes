package cf;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.IntStream;

public class DivisiblePermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Integer, int[]> permutation = n -> {
            int[] p = new int[n];
            p[0] = (n + 1) / 2;
            for (int i = 1; i < n; i++) {
                int diff = i;
                int prev = p[i - 1];
                if (prev + diff <= n) {
                    p[i] = prev + diff;
                } else {
                    p[i] = prev - diff;
                }
            }
            return p;
        };

        Consumer<Scanner> performTestCases = sc -> {
            int[] ans = permutation.apply(sc.nextInt());
            for (int i=0;i<ans.length-1;i++)
                System.out.print(ans[i] + " ");
            System.out.print(ans[ans.length-1]);
            System.out.println();
        };

        IntStream.range(0, scanner.nextInt()).forEach(i -> performTestCases.accept(scanner));
    }

}
