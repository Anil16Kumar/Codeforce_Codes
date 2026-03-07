package cf;

import java.util.Scanner;

public class wormPile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int Arr[] = new int[n];
        for (int i = 0; i < n; i++)
            Arr[i] = scanner.nextInt();
        int k = scanner.nextInt();
        int Brr[] = new int[k];
        for (int i = 0; i < k; i++)
            Brr[i] = scanner.nextInt();

        int range[] = new int[n];
        range[0] = Arr[0];
        for (int i = 1; i < n; i++)
            range[i] = range[i - 1] + Arr[i];

        for (int i = 0; i < k; i++) {
            int left = 0, right = n - 1;
            while (left <= right) {
                int mid = (left + right) / 2;
                if (Brr[i] <= range[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
            System.out.println(left + 1);
        }

    }
}
