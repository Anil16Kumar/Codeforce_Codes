package StackQueue;

import java.util.PriorityQueue;
import java.util.Scanner;

public class kDeletions {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String str=scanner.next();
        int k=scanner.nextInt();

        System.out.println(maxSubseq(str,k));
    }

    private static String maxSubseq(String str, int k) {

        PriorityQueue<Character> pq=new PriorityQueue<>();
        StringBuilder sb=new StringBuilder(str);

        int i=str.length()-1;
        while(i>=0){

        }
return null;
    }
}
