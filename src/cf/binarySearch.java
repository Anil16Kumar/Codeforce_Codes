package cf;

import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] Arr = new int[n];
        for (int i = 0; i < n; i++)
            Arr[i] = scanner.nextInt();

        int target = scanner.nextInt();

        int left = 0;
        int right = n - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (Arr[mid] <= target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        System.out.println(left);
    }
}
