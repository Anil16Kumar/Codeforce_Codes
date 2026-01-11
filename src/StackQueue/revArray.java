package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class revArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        int[] answer=revArrayFunction(A);
        for(int i:answer)
            System.out.print(i+" ");
    }

    private static int[] revArrayFunction(int[] a) {

        revArrayFunctionHelp(a,a.length,0);
        return a;
        //        stk.pop();
    }

    private static void revArrayFunctionHelp(int[] a,int n,int i) {
        if(n<=1 || i>=n/2)
            return;

        int val=a[n-1];
        revArrayFunctionHelp(a,n-1,i+1);
        putAtRightPlace(a,i);
        return;
    }

    private static void putAtRightPlace(int[] a,int i) {

        int temp=a[i];
        a[i]=a[a.length-1-i];
        a[a.length-1-i]=temp;
        return;
    }
}
