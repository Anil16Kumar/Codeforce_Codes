package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class stackMinpop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        Stack<Integer> stk=new Stack<>();

        for(int i:A)
            stk.add(i);


    }
}
