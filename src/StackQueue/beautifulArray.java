package StackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class beautifulArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int[] A=new int[n];

        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        ArrayList<Integer> answer=makeBeautiful(A);
        System.out.println(answer);
    }

    private static ArrayList<Integer> makeBeautiful(int[] a) {

        Stack<Integer> stk=new Stack<>();

        for(int val:a){
            if(!stk.isEmpty() && stk.peek()>0 && val<=0 || !stk.isEmpty() && stk.peek()<0 && val>=0){
                stk.pop();
            }
            else
                stk.add(val);
        }
        ArrayList<Integer> answer=new ArrayList<>();

        while(!stk.isEmpty()){
            answer.add(stk.pop());
        }

        Collections.reverse(answer);
        return answer;

    }
}






