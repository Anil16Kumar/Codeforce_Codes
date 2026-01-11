package twoPointers;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class pairCountLess {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t--!=0) {
            int n = scanner.nextInt();
            int[] A = new int[n];

            for (int i = 0; i < n; i++)
                A[i] = scanner.nextInt();

            int target = scanner.nextInt();

            System.out.println("Brute Force Approach: "+countPairBruteForceApproach(A,target));
            System.out.println("Two pointer: "+countPair(A, target));
        }
    }


    Function<Integer,Integer> fun= n1-> n1-10;

    private static int countPairBruteForceApproach(int[] a,int target){
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] < target)
                    count++;
            }
        }
        return count;
    }

    private static int countPair(int[] a, int target) {
        Arrays.sort(a);
        int i=0,j=a.length-1;
        int count=0;
        while(i<j){
            if(a[i]+a[j]>=target){
                j--;
            }
            else{
                count+=(j-i);
                i++;
            }
        }
        return count;
    }
}
