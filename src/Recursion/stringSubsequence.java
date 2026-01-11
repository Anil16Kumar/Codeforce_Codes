package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class stringSubsequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        String s1=scanner.next();
        String s2=scanner.next();

        ArrayList<String> ssq1=allStringSubsequence(s1);
        System.out.println(ssq1);
        ArrayList<String> ssq2=allStringSubsequence(s2);
        System.out.println(ssq2);

        if(ssq2.size()>ssq1.size())
            System.out.println(s2);
        else
            System.out.println(s1);
    }

    private static ArrayList<String> allStringSubsequence(String s1) {
        ArrayList<String> answer=new ArrayList<>();
        String temp=new String();
        allStringSubsequenceHelp(s1,0,temp,answer);
        return answer;

    }

    private static void allStringSubsequenceHelp(String s1,int idx,String temp,ArrayList<String> answer) {

        if(idx==s1.length()){
            String curr=new String(temp);
            if(!answer.contains(curr))
                answer.add(curr);
            return;
        }

        temp+=s1.charAt(idx);
        allStringSubsequenceHelp(s1,idx+1,temp,answer);

        temp=temp.substring(0,temp.length()-1);
        allStringSubsequenceHelp(s1,idx+1,temp,answer);

        return;
    }
}
