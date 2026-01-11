package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class stackValidate {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while(t--!=0){
            int n=scanner.nextInt();
            int[] A=new int[n];
            for(int i=0;i<n;i++)
                A[i]=scanner.nextInt();
            int[] B=new int[n];
            for(int i=0;i<n;i++)
                B[i]=scanner.nextInt();

            System.out.println(Validate(A,B));
        }
    }

    private static boolean Validate(int[] a, int[] b) {

        Stack<Integer> stk=new Stack<>();
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            stk.add(a[i]);
            while(!stk.empty() && stk.peek()==b[j]){
                stk.pop();
                j++;
            }
        }
        return stk.isEmpty();
    }
}
