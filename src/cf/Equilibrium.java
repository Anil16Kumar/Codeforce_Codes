package cf;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Equilibrium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] sum = new int[3];

        IntStream.range(0, n).forEach(i -> {
            sum[0] += sc.nextInt();
            sum[1] += sc.nextInt();
            sum[2] += sc.nextInt();
        });

        System.out.println(
                (sum[0] == 0 && sum[1] == 0 && sum[2] == 0) ? "YES" : "NO"
        );
    }
}
