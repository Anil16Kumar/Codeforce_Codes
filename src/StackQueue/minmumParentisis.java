package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class minmumParentisis {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int t=scanner.nextInt();
        while (t--!=0) {
            String str = scanner.next();
            System.out.println(minParentheses(str));
        }
    }

    private static int minParentheses(String str) {

        Stack<Character> stk=new Stack<>();
        char[] ch=str.toCharArray();
        int i=0;
        while(i!=str.length()){
            if(!stk.empty() && ch[i]==')'){
                if(stk.peek()=='(')
                    stk.pop();
                else
                    stk.add(ch[i]);
            }
            else
                stk.add(ch[i]);
            i++;
        }

        return stk.size();
    }
}
