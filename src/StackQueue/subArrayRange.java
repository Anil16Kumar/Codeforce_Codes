package StackQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class subArrayRange {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int[] A=new int[n];
        for(int i=0;i<n;i++)
            A[i]=scanner.nextInt();

        System.out.println(subarrayRangesFunction(A));
    }

    private static int subarrayRangesFunction(int[] a) {

        ArrayList<Integer> nse=nextSmallestElement(a);
        ArrayList<Integer> pse=previousSmallestElement(a);
        int totalMinimumValuesSum=0;
        for(int i=0;i<a.length;i++)
            totalMinimumValuesSum += (i-nse.get(i))*(pse.get(i)-i)*a[i];

        ArrayList<Integer> nge=nextGreatestElement(a);
        ArrayList<Integer> pge=previousGreatestElement(a);
        int totalMaximumValueSum=0;
        for(int i=0;i<a.length;i++)
            totalMaximumValueSum += (i-nge.get(i))*(pge.get(i)-i)*a[i];

        return totalMaximumValueSum - totalMinimumValuesSum;
    }

    private static ArrayList<Integer> previousGreatestElement(int[] a) {

        ArrayList<Integer> answer=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<a.length;i++){
            while(!stk.empty() && a[stk.peek()]<a[i])
                stk.pop();

            if(stk.empty())
                answer.add(-1);
            else
                answer.add(stk.peek());
            stk.add(i);
        }

        return answer;

    }

    private static ArrayList<Integer> nextGreatestElement(int[] a) {

        ArrayList<Integer> answer=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();

        for(int i=a.length-1;i>=0;i--){
            while(!stk.empty() && a[stk.peek()]<=a[i])
                stk.pop();

            if(stk.empty())
                answer.add(a.length);
            else
                answer.add(stk.peek());
            stk.add(i);
        }
        Collections.reverse(answer);
        return answer;
    }

    private static ArrayList<Integer> nextSmallestElement(int[] a) {
        ArrayList<Integer> answer=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();

        for(int i=a.length-1;i>=0;i--){
            while(!stk.empty() && a[stk.peek()]>=a[i])
                stk.pop();
            if(stk.empty())
                answer.add(a.length);
            else
                answer.add(stk.peek());
            stk.add(i);
        }

        Collections.reverse(answer);
        return answer;
    }

    private static ArrayList<Integer> previousSmallestElement(int[] a) {

        ArrayList<Integer> answer=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<a.length;i++){
            while(!stk.empty() && a[stk.peek()]>a[i])
                stk.pop();
            if(stk.empty())
                answer.add(-1);
            else
                answer.add(stk.peek());
            stk.add(i);
        }

        return answer;
    }
}
