package twoPointers;

import java.util.Scanner;

public class BirdAndMaximumFruit {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] Arr=new int[n];
        for(int i=0;i<n;i++)
            Arr[i]=scanner.nextInt();
        int totalTime=scanner.nextInt();
        int windowSize=(totalTime * 2 + 1) / 2;

        System.out.println( maxSubarraySum(Arr,windowSize) );

    }
    public static int maxSubarraySum(int[] A, int k) {
        int n=A.length;

        if (k >= n) {
            int sum = 0;
            for (int x : A) sum += x;
            return sum;
        }

        int left=0;
        int right=0;

        int answer=Integer.MIN_VALUE;
        int temp_sum=0;

        while(right<n){

            temp_sum+=A[right];
            int window_size=right-left+1;

            if(window_size<k){
                right++;
            }
            else{
                answer=Math.max(answer,temp_sum);
                temp_sum-=A[left];
                left++;
                right++;
            }
        }
        return answer;
    }
}
