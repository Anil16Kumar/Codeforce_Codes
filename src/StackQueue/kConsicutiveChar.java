package StackQueue;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class kConsicutiveChar {
    static class Pair{
        char ch;
        int count;

        Pair(char ch, int count){
            this.ch=ch;
            this.count=count;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t=scanner.nextInt();

        while (t--!=0){
            String str=scanner.next();
            int k=scanner.nextInt();

            System.out.println(reduced_String(k,str));
        }

    }

    private static String reduced_String(int k, String str) {

        Stack<Pair> stk=new Stack<>();
        for(char c: str.toCharArray()){
            if(!stk.empty() && stk.peek().ch==c){
                stk.peek().count++;
                if(stk.peek().count==k)
                    stk.pop();
            }
            else{
                stk.add(new Pair(c,1));
            }
        }

        StringBuilder builder=new StringBuilder();
        for(Pair val:stk){
            builder.append(String.valueOf(val.ch).repeat(val.count));
        }
        return builder.toString();
    }
}
