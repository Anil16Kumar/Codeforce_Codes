package cf;

import java.util.Scanner;

public class Kefa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] Arr = new int[n];

        for (int i = 0; i < n; i++)
            Arr[i] = scanner.nextInt();

        int answer = 1;
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (Arr[i] >= Arr[i - 1]) {
                count++;
            } else {
                count = 1;
            }
            answer = Math.max(answer, count);
        }

        System.out.println(answer);

    }
}
