package Strings;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class stringChar {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str="abcdefghijklmonp";

        char[] stringBuilder=str.toCharArray();

        for(int i=str.length()-1;i>=0;i--)
            System.out.println(stringBuilder[i]);

        Queue<Integer> que=new LinkedList<>();
        que.remove();
//        que.is
    }
}
