package twoPointers;

import java.util.Scanner;

public class slowFastPointer {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        System.out.println(slowAndFastPointer(A));
    }

    public static int slowAndFastPointer(int[] A){

        int slow = A[0];
        int fast = A[0];

        slow = A[slow];
        fast = A[A[fast]];

        while (slow != fast) {
            slow = A[slow];
            fast = A[A[fast]];
        }

        slow = A[0];
        while (slow != fast) {
            slow = A[slow];
            fast = A[fast];
        }

        return slow;
    }
}
