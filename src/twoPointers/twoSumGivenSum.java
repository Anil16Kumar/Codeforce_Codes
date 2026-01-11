package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class twoSumGivenSum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        int target=scanner.nextInt();
        System.out.println(twosum(A,target));
    }

    private static List<Integer> twosum(int[] a, int target) {

        Arrays.sort(a);
        int i=0,j=a.length-1;
        List<Integer> answer=new ArrayList<>();
        while(i<j){
            if(a[i]+a[j]==target){
                answer.add(a[i]);
                answer.add(a[j]);
                break;
            }
            else if(a[i]+a[j] > target)
                j--;
            else
                i++;
        }
        return answer;
    }
}
