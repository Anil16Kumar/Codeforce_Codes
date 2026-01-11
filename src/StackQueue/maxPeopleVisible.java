package StackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class maxPeopleVisible {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] a=new int[n];
        for(int i=0;i<n;i++)
            a[i]=scanner.nextInt();

        System.out.println(maxPeopleVisibleHelpFunction(a));
    }

    private static int maxPeopleVisibleHelpFunction(int[] a) {

        ArrayList<Integer> left2right=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        for(int i=0;i<a.length;i++){
            int temp=0;
            while(!stk.empty() && a[stk.peek()]<a[i]){
                stk.pop();
                temp=1;
            }

            if(stk.empty()  ){
                left2right.add(i);
                stk.add(i);
            }
            else{
                left2right.add(i-stk.peek()-1);
                stk.add(i);
            }
        }

        ArrayList<Integer> right2left = new ArrayList<>();
        Stack<Integer> stk2=new Stack<>();
        for(int i=a.length-1;i>=0;i--){
            int temp=0;
            while(!stk2.empty() && a[stk2.peek()]<a[i]){
                stk2.pop();
                temp=1;
            }

            if(stk2.empty() ){
                right2left.add(a.length - 1 - i);
                stk2.add(i);
            }
            else{
                right2left.add(stk2.peek()-i-1);
                stk2.add(i);
            }
        }
        Collections.reverse(right2left);

        System.out.println(left2right);
        System.out.println(right2left);


        int maxValue=0;
        for(int i=0;i<a.length;i++)
            maxValue=Math.max(maxValue,left2right.get(i) + right2left.get(i)+1);

        return maxValue;

    }
}
