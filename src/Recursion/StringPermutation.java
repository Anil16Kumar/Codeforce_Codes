package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str=scanner.next();

        ArrayList<String> answer=allPermutation(str);

        System.out.println(answer);
    }

    private static ArrayList<String> allPermutation(String str) {

        ArrayList<String> answer=new ArrayList<>();

        allPermutationHelp(str,0,str.length()-1,answer);

        return answer;
    }

    private static void allPermutationHelp(String str, int l, int r, ArrayList<String> answer) {
        if(l==r)
        {
            //String temp=new String(str);
            answer.add(str);
            return;
        }

        for(int i=l;i<=r;i++){
            str=swap(str,l,i);
            allPermutationHelp(str,l+1,r,answer);
            str=swap(str,l,i);
        }
        return;
    }

    private static String swap(String str, int l, int i) {
        char[] chars = str.toCharArray();

        char temp = chars[l];
        chars[l] = chars[i];
        chars[i] = temp;

        return new String(chars);
    }



}
