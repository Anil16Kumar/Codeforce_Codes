package cf;

import java.util.Arrays;
import java.util.Scanner;

public class puzzle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] f = new int[m];
        for (int i = 0; i < m; i++) {
            f[i] = sc.nextInt();
        }

        Arrays.sort(f);

        int minDiff = Integer.MAX_VALUE;

        for (int left = 0; left <= m - n; left++) {
            int right = left + n - 1; // fixed window size
            minDiff = Math.min(minDiff, f[right] - f[left]);
        }

        System.out.println(minDiff);
    }
}
