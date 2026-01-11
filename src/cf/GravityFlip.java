package cf;

import java.util.Scanner;

public class GravityFlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] Arr = new int[n];

        for (int i = 0; i < n; i++)
            Arr[i] = scanner.nextInt();

        for (int i = n - 1; i >= 0; i--) {
            int val = Arr[i];
            int temp = i;
            for (int j = i - 1; j >= 0; j--)
                if (Arr[j] > val) {
                    val = Arr[j];
                    temp = j;
                }
            int diff = val - Arr[i];
            Arr[i] += diff;
            Arr[temp] -= diff;
        }

        for (int value : Arr)
            System.out.println(value);
        System.out.println(Arr);

    }
}
