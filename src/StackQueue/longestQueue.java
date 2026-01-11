package StackQueue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class longestQueue {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=scanner.nextInt();
        int x=scanner.nextInt();

        System.out.println(longestSubarray(arr,x));
    }

    private static ArrayList<Integer> longestSubarray(int[] arr, int x) {

        ArrayList<Integer> answer=new ArrayList<>();
        int n=arr.length;
        int i=0;
        while(i<n-1){
            if(Math.abs(arr[i]-arr[i+1])<x){
                ArrayList<Integer> temp=new ArrayList<>();
                while(i<n-1 && Math.abs(arr[i]-arr[i+1])<x){
                    temp.add(arr[i]);
                    i++;
                }
                temp.add(arr[i]);
                if(temp.size()>=answer.size())
                    answer=temp;
            }
            i++;
        }
        return answer;
    }
}
