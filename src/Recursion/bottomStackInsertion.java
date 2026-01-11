package Recursion;

import java.util.Scanner;
import java.util.Stack;

public class bottomStackInsertion {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        Stack<Integer> stk=new Stack<>();

        for(int i=0;i<n;i++)
            stk.add(scanner.nextInt());

        int x=scanner.nextInt();

        insertAtBottomOfStack(stk,x);
        System.out.println(stk);
    }

    private static void insertAtBottomOfStack(Stack<Integer> stk, int x) {

        if(stk.size()==1 || stk.isEmpty()){
            int val=stk.pop();
            stk.add(x);
            stk.add(val);
            return;
        }

        int ele=stk.pop();
        insertAtBottomOfStack(stk,x);
        stk.add(ele);
        return;
    }


}
