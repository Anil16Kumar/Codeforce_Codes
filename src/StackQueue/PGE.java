package StackQueue;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class PGE {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        ArrayList<Integer> answer=perfrompge(A);
        for(int val:answer)
            System.out.println(val);

    }

    private static ArrayList<Integer> perfrompge(int[] a) {

        ArrayList<Integer> answer=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();

        for(int val:a){
            while(!stk.empty() && stk.peek()<=val){
                stk.pop();
            }

            if(stk.empty()){
                answer.add(-1);
                stk.add(val);
            }

            else if(stk.peek()>val){
                answer.add(stk.peek());
                stk.add(val);
            }
        }
        return answer;
    }
}
