package cf;

import java.util.Scanner;

public class DestinatinTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] Arr = new int[n - 1];

        for (int i = 0; i < n - 1; i++)
            Arr[i] = scanner.nextInt();

        int current = 1;

        while (current < t) {
            current = current + Arr[current - 1];
        }

        if (current == t)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
