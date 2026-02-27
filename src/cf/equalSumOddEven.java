package cf;

import java.util.Scanner;

public class equalSumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            if (n % 4 != 0) {
                System.out.println("NO");
                continue;
            }

            System.out.println("YES");

            int k = n / 2;
            int sumEven = 0;

            for (int i = 1; i <= k; i++) {
                int val = 2 * i;
                sumEven += val;
                System.out.print(val + " ");
            }

            int sumOdd = 0;

            for (int i = 1; i < k; i++) {
                int val = 2 * i - 1;
                sumOdd += val;
                System.out.print(val + " ");
            }

            System.out.println(sumEven - sumOdd);
        }

    }
}
