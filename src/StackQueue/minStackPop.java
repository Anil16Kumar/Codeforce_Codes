package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class minStackPop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int[] A=new int[n];

        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        Stack<Integer> stk;
        stk=minPopfunction(A);

        while(!stk.empty()){
            System.out.println(stk.pop());
        }

    }

    private static Stack<Integer> minPopfunction(int[] a) {

        Stack<Integer> stk=new Stack<>();
        Stack<Integer> tempstk=new Stack<>();
        tempstk.add(a[0]);
        for(int i=0;i<a.length;i++){
            stk.add(a[i]);
            if(i!=0 && a[i]<=tempstk.peek())
                tempstk.add(a[i]);
        }
//        System.out.println("stack values:");
//        System.out.println(tempstk);
        Stack<Integer> answer=new Stack<>();
        while(!stk.empty()){
            if(tempstk.peek()<=stk.peek()){
                answer.add(tempstk.peek());
                if(tempstk.peek()==stk.peek())
                    tempstk.pop();
            }
            stk.pop(); 
        }

        Stack<Integer> revStack=new Stack<>();
        while(!answer.empty())
            revStack.add(answer.pop());

        return revStack;


    }
}
