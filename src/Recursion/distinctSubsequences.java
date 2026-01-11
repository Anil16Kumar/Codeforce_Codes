package Recursion;

import java.util.Scanner;

public class distinctSubsequences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println(allDistictSubsequence(str));
    }

    private static int allDistictSubsequence(String str) {
        int n = str.length();

        int[] dp = new int[n + 1];

        dp[0] = 1;

        if (n >= 1)
            dp[1] = 2;

        for (int i = 2; i <= n; i++) {
            dp[i] = (2 * dp[i - 1]) - reptition(str, i - 1, dp);
        }
        return dp[n];
    }

    private static int reptition(String str, int idx, int[] dp) {
        char ch = str.charAt(idx);

        for (int i = idx - 1; i >= 0; i--) {
            if (str.charAt(i) == ch) { // -> string ka i(index) use ho raha hai dp ke i me...
                return dp[i];
            }
        }
        return 0;
    }
}
