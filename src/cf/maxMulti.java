package cf;

import java.util.Scanner;

public class maxMulti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int sum = 0;
            int answer = 0;
            int max_sum = Integer.MIN_VALUE;
            for (int x = 2; x <= n; x++) {
                int i = 1;
                sum = 0;
                while (true) {
                    if ((i * x) > n)
                        break;

                    sum += (i * x);

                    if (sum > max_sum) {
                        max_sum = sum;
                        answer = x;
                    }
                    i++;
                }
            }
            System.out.println(answer);
        }
    }
}