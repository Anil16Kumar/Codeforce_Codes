package StackQueue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class asteroidCollision {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        int[] answer=asteroidCollisionFunction(n,A);

        for(int i:answer)
         System.out.println(i+" ");

    }

    private static int[] asteroidCollisionFunction(int n, int[] a) {

        Stack<Integer> stk=new Stack<>();
        ArrayList<Integer> answer=new ArrayList<>();

        int i=0;
       while(i<a.length){
            if(!stk.empty()){
               if((stk.peek()>0 && a[i]>0) ||(stk.peek()<0 && a[i]<0) ||
                       (stk.peek()<0 && a[i]>0)){
                   stk.add(a[i]);
                   i++;
               }

               else {
                   if(stk.peek() < Math.abs(a[i]))
                       stk.pop();
                   else if(stk.peek()>Math.abs(a[i]))
                       i++;
                   else{
                       stk.pop();
                       i++;
                   }
               }

            }
            else{
                stk.add(a[i]);
                i++;
            }
        }

//        System.out.println(stk);
        while (!stk.empty())
            answer.add(stk.pop());

        Collections.reverse(answer);

        int[] arr = new int[answer.size()];
        for (int j = 0; j < answer.size(); j++) {
            arr[j] = answer.get(j);
        }

        return arr;
    }
}
